package com.changethis.android.ui.views.components.input;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.changethis.android.ui.model.dto.component.ComponentTextContents;
import com.changethis.android.ui.model.dto.component.InputConfig;
import com.changethis.android.ui.model.dto.component.style.ViewComponentBackgroundParams;
import com.changethis.android.ui.model.dto.component.style.ViewComponentParams;
import com.changethis.android.ui.model.dto.component.style.ViewComponentTextStyle;
import com.changethis.android.ui.views.components.base.ViewComponentFactory;

import java.lang.reflect.Field;

import static com.changethis.android.ui.model.dto.component.annotations.BackgroundType.INPUT;

/**
 * Created by mgigena on 14/2/18.
 */

public class CustomTextInputCreator implements ViewComponentFactory.CustomCreator {

    private final ViewComponentParams params;
    private final ComponentTextContents textContents;
    private final Context context;
    private final ViewComponentTextStyle textStyle;
    private final ViewComponentBackgroundParams backgroundParams;
    private EditText editText;
    private TextView textView;

    public CustomTextInputCreator(ViewComponentParams params, ComponentTextContents textContents, Context context) {
        this.params = params;
        this.textContents = textContents;
        this.context = context;
        textStyle = params.getTextStyle();
        backgroundParams = params.getBackgroundParams();
    }

    @Override
    public View create() {
        return getInputContainer();
    }

    private LinearLayout getInputContainer() {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(params.getWidth(), params.getHeight()));
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        if (!textContents.getTitle().isEmpty()) {
            prepareTitle();
            linearLayout.addView(textView);
        }
        prepareEditText();
        linearLayout.addView(editText);

        return linearLayout;
    }

    private void prepareEditText() {
        editText = new EditText(context);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            editText.setId(View.generateViewId());
        }
        if (!textContents.getHint().isEmpty()) {
            editText.setHint(textContents.getHint());
            editText.setHintTextColor(Color.parseColor(textStyle.getHintTextColor()));
        }
        editText.setTextSize(textStyle.getTextSize());
        editText.setTextColor(Color.parseColor(textStyle.getTextColor()));

        switch (backgroundParams.getBackgroundType()) {
            case INPUT:
                editText.getBackground().mutate().setColorFilter(Color.parseColor(backgroundParams.getBorderColor()), PorterDuff.Mode.SRC_ATOP);
                changeEditTextCursorColor(backgroundParams.getBorderColor());
                break;
        }

        InputConfig inputConfig = params.getInputConfig();
        editText.setInputType(inputConfig.getInputType());
        setEditTextTypeFace();
    }

    private void setEditTextTypeFace() {
        String fontTypeface = textStyle.getFontTypeface();
        if (fontTypeface != null && !fontTypeface.isEmpty()) {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(),
                    fontTypeface);
            editText.setTypeface(typeface);
        }
    }

    private void changeEditTextCursorColor(String cursorColor) {
        try {
            int color = Color.parseColor(cursorColor);
            Field fieldCursorDrawableRes =
                    TextView.class.getDeclaredField("mCursorDrawableRes");
            fieldCursorDrawableRes.setAccessible(true);
            int cursorDrawableRes = fieldCursorDrawableRes.getInt(editText);
            Field fieldEditor = TextView.class.getDeclaredField("mEditor");
            fieldEditor.setAccessible(true);
            Object editor = fieldEditor.get(editText);
            Class<?> clazz = editor.getClass();
            Field fieldCursorDrawable = clazz.getDeclaredField("mCursorDrawable");
            fieldCursorDrawable.setAccessible(true);

            Drawable[] drawables = new Drawable[2];
            Resources res = editText.getContext().getResources();
            drawables[0] = res.getDrawable(cursorDrawableRes);
            drawables[1] = res.getDrawable(cursorDrawableRes);
            drawables[0].setColorFilter(color, PorterDuff.Mode.SRC_IN);
            drawables[1].setColorFilter(color, PorterDuff.Mode.SRC_IN);
            fieldCursorDrawable.set(editor, drawables);
        } catch (final Throwable ignored) {
            // TODO log this error
        }
    }

    private void prepareTitle() {
        textView = new TextView(context);
        textView.setText(textContents.getTitle());
        setTextSize();
        setTextGravity();
        setTextColor();
        setTextFont();
    }

    private void setTextSize() {
        textView.setTextSize(textStyle.getTitleTextSize());
    }

    private void setTextGravity() {
        textView.setGravity(textStyle.getTextGravity());
    }

    private void setTextColor() {
        textView.setTextColor(Color.parseColor(textStyle.getTextColor()));
    }

    private void setTextFont() {
        String fontTypeface = textStyle.getTitleFontTypeface();
        if (fontTypeface != null && !fontTypeface.isEmpty()) {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(),
                    fontTypeface);
            textView.setTypeface(typeface);
        }
    }
}
