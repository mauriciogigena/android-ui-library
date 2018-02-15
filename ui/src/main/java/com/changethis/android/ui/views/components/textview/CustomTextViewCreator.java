package com.changethis.android.ui.views.components.textview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
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
    private final ViewComponentTextStyle textStyle;
    private TextView textView;

    public CustomTextViewCreator(ViewComponentParams params, ComponentTextContents textContents, Context context) {
        this.params = params;
        this.textContents = textContents;
        this.context = context;
        textStyle = params.getTextStyle();
    }

    /**
     * set view attributes
     */
    @Override
    public TextView create() {
        textView = new TextView(context);
        textView.setText(textContents.getText());
        setTextColor();
        setTextFont();
        setTextGravity();
        setTextSize();
        return textView;
    }

    private void setTextSize() {
        textView.setTextSize(textStyle.getTextSize());
    }

    private void setTextGravity() {
        textView.setGravity(textStyle.getTextGravity());
    }

    private void setTextColor() {
        textView.setTextColor(Color.parseColor(textStyle.getTextColor()));
    }

    private void setTextFont() {
        String textFont = textStyle.getFontTypeface();
        if (textFont != null && !textFont.isEmpty()) {
            Typeface face = Typeface.createFromAsset(context.getAssets(),
                    textFont);
            textView.setTypeface(face);
        }
    }
}
