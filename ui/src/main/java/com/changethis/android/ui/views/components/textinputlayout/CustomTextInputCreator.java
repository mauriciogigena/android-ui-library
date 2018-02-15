package com.changethis.android.ui.views.components.textinputlayout;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.changethis.android.ui.model.dto.component.ComponentTextContents;
import com.changethis.android.ui.model.dto.component.InputConfig;
import com.changethis.android.ui.model.dto.component.style.ViewComponentParams;
import com.changethis.android.ui.views.components.base.ViewComponentFactory;

/**
 * Created by mgigena on 14/2/18.
 */

public class CustomTextInputCreator implements ViewComponentFactory.CustomCreator {

    private final ViewComponentParams params;
    private final ComponentTextContents textContents;
    private final Context context;

    public CustomTextInputCreator(ViewComponentParams params, ComponentTextContents textContents, Context context) {
        this.params = params;
        this.textContents = textContents;
        this.context = context;
    }

    @Override
    public EditText create() {

        return getEditText();
    }

    private EditText getEditText() {
        EditText editText = new EditText(context);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            editText.setId(View.generateViewId());
        }
        editText.setHint(textContents.getHint());
        editText.setHintTextColor(Color.parseColor(params.getTextStyle().getHintTextColor()));

        InputConfig inputConfig = params.getInputConfig();
        editText.setInputType(inputConfig.getInputType());

        return editText;
    }

    private void setTextSize(TextView textView, int textSize) {
        textView.setTextSize(textSize);
    }

    private void setTextGravity(TextView textView, int textGravity) {
        textView.setGravity(textGravity);
    }

    private void setTextColor(TextView textView, @NonNull String textColor) {
        textView.setTextColor(Color.parseColor(textColor));
    }

    private void setTextFont(Context context, TextView textView, @NonNull String textFont) {
        if (textFont != null && !textFont.isEmpty()) {
            Typeface face = Typeface.createFromAsset(context.getAssets(),
                    textFont);
            textView.setTypeface(face);
        }
    }
}
