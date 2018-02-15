package com.changethis.android.ui.model.dto.component.style;

/**
 * Created by mgigena on 9/2/18.
 */

public class ViewComponentTextStyle {
    private final int textGravity;
    private final int errorTextGravity;
    private final int textSize;
    private final int errorTextSize;
    private final int titleTextSize;
    private final String fontTypeface;
    private final String titleFontTypeface;
    private final String errorFontTypeface;
    private final String textColor;
    private final String errorTextColor;
    private final String hintTextColor;

    /**
     * @param textGravity       check android Gravity.class
     * @param errorTextGravity
     * @param textSize          set it in px
     * @param errorTextSize
     * @param titleTextSize
     * @param fontTypeface      check @interface FontTypes
     * @param titleFontTypeface
     * @param errorFontTypeface
     * @param textColor         set it in hex, parse to int before change color
     * @param errorTextColor    set it in hex, parse to int before change color
     * @param hintTextColor     set it in hex, parse to int before change color
     */
    public ViewComponentTextStyle(int textGravity, int errorTextGravity, int textSize, int errorTextSize, int titleTextSize, String fontTypeface, String titleFontTypeface, String errorFontTypeface, String textColor, String errorTextColor, String hintTextColor) {
        this.textGravity = textGravity;
        this.errorTextGravity = errorTextGravity;
        this.textSize = textSize;
        this.errorTextSize = errorTextSize;
        this.titleTextSize = titleTextSize;
        this.fontTypeface = fontTypeface;
        this.titleFontTypeface = titleFontTypeface;
        this.errorFontTypeface = errorFontTypeface;
        this.textColor = textColor;
        this.errorTextColor = errorTextColor;
        this.hintTextColor = hintTextColor;
    }


    public int getTextGravity() {
        return textGravity;
    }

    public int getTextSize() {
        return textSize;
    }

    public String getFontTypeface() {
        return fontTypeface;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getErrorTextColor() {
        return errorTextColor;
    }

    public String     getHintTextColor() {
        return hintTextColor;
    }

    public int getErrorTextGravity() {
        return errorTextGravity;
    }

    public int getErrorTextSize() {
        return errorTextSize;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public String getTitleFontTypeface() {
        return titleFontTypeface;
    }

    public String getErrorFontTypeface() {
        return errorFontTypeface;
    }
}
