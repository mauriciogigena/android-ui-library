package com.changethis.android.ui.views.components.textview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.widget.TextView;

import com.changethis.android.ui.model.dto.component.ComponentTextContents;
import com.changethis.android.ui.model.dto.component.style.ViewComponentParams;
import com.changethis.android.ui.model.dto.component.style.ViewComponentTextStyle;
import com.changethis.android.ui.views.components.base.ViewComponentFactory;

/**
 * Created by mgigena on 14/2/18.
 */

public class CustomTextViewCreator implements ViewComponentFactory.CustomCreator {

    private final ViewComponentParams params;
    private final ComponentTextContents textContents;
    private final Context context;

    public CustomTextViewCreator(ViewComponentParams params, ComponentTextContents textContents, Context context) {
        this.params = params;
        this.textContents = textContents;
        this.context = context;
    }

    /**
     * set view attributes
     */
    @Override
    public TextView create() {
        TextView view = new TextView(context);
        ViewComponentTextStyle textStyle = params.getTextStyle();
        setTextColor(view, textStyle.getTextColor());
        setTextFont(context, view, textStyle.getFontType());
        setTextGravity(view, textStyle.getTextGravity());
        setTextSize(view, textStyle.getTextSize());
        view.setText(textContents.getText());
        return view;
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
