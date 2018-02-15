package com.changethis.android.ui.model.dto.component.style;

/**
 * Created by mgigena on 14/2/18.
 */

public class ViewComponentBackgroundParams {
    private final int backgroundType;
    private final String backgroundColor;
    private final String borderColor;
    private final int borderAnchor;

    /**
     *
     * @param backgroundType  check @interface ComponentBackgroundTypes (CIRCULAR; OVAL; RECTANGLE)
     * @param backgroundColor set it in hex, parse to int before change color
     * @param borderColor     set it in hex, parse to int before change color
     * @param borderAnchor    set it in px
     */
    public ViewComponentBackgroundParams(int backgroundType, String backgroundColor, String borderColor, int borderAnchor) {
        this.backgroundType = backgroundType;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.borderAnchor = borderAnchor;
    }

    public int getBackgroundType() {
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
