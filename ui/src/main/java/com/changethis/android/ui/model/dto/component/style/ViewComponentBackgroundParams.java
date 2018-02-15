package com.changethis.android.ui.model.dto.component.style;

/**
 * Created by mgigena on 14/2/18.
 */

public class ViewComponentBackgroundParams {
    private final String backgroundType;
    private final String backgroundColor;
    private final String borderColor;
    private final int borderAnchor;

    /**
     *
     * @param backgroundType  check @interface #link{BackgroundTypes.java}
     * @param backgroundColor set it in hex, parse to int before change color
     * @param borderColor     set it in hex, parse to int before change color
     * @param borderAnchor    set it in px
     */
    public ViewComponentBackgroundParams(String backgroundType, String backgroundColor, String borderColor, int borderAnchor) {
        this.backgroundType = backgroundType;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.borderAnchor = borderAnchor;
    }

    public String getBackgroundType() {
        return backgroundType;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public int getBorderAnchor() {
        return borderAnchor;
    }
}
