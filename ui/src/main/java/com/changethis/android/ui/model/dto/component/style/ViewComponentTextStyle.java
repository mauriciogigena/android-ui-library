package com.changethis.android.ui.model.dto.component.style;

/**
 * Created by mgigena on 9/2/18.
 */

public class ViewComponentTextStyle {
    private final int textGravity;
    private final int textSize;
    private final String fontType;
    private final String textColor;
    private final String errorTextColor;
    private final String hintTextColor;

    /**
     * @param textGravity    check android Gravity.class
     * @param textSize       set it in px
     * @param textColor      set it in hex, parse to int before change color
     * @param fontType       check @interface FontTypes
     * @param errorTextColor set it in hex, parse to int before change color
     * @param hintTextColor  set it in hex, parse to int before change color
     */
    public ViewComponentTextStyle(int textGravity, int textSize, String fontType, String textColor, String errorTextColor, String hintTextColor) {
        this.textGravity = textGravity;
        this.textSize = textSize;
        this.fontType = fontType;
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

    public String getFontType() {
        return fontType;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getErrorTextColor() {
        return errorTextColor;
    }

    public String getHintTextColor() {
        return hintTextColor;
    }
}
