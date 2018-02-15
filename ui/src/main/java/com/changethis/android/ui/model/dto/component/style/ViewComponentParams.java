package com.changethis.android.ui.model.dto.component.style;

import com.changethis.android.ui.model.dto.component.InputConfig;

/**
 * Created by mgigena on 7/2/18.
 */

public class ViewComponentParams {
    private final int height;
    private final int width;
    private final int gravity;
    private final ViewComponentMargins margins;
    private final ViewComponentPaddings paddings;
    private final ViewComponentTextStyle textStyle;
    private final InputConfig inputConfig;
    private final String imageUrl;
    private final ViewComponentBackgroundParams backgroundParams;

    /**
     * @param height      -1 for match_parent; -2 for wrap_content
     * @param width       -1 for match_parent; -2 for wrap_content
     * @param gravity     check android Gravity.class
     * @param margins     set it in px
     * @param textStyle   set text style
     * @param paddings    set it in px
     * @param inputConfig for keyboard on input labels
     * @param imageUrl    image location for piccaso
     */
    public ViewComponentParams(int height, int width, int gravity, ViewComponentMargins margins, ViewComponentTextStyle textStyle, ViewComponentPaddings paddings, InputConfig inputConfig, String imageUrl, ViewComponentBackgroundParams backgroundParams) {
        this.height = height;
        this.width = width;
        this.gravity = gravity;
        this.textStyle = textStyle;
        this.margins = margins;
        this.paddings = paddings;
        this.inputConfig = inputConfig;
        this.imageUrl = imageUrl;
        this.backgroundParams = backgroundParams;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getGravity() {
        return gravity;
    }

    public ViewComponentMargins getMargins() {
        return margins;
    }

    public ViewComponentPaddings getPaddings() {
        return paddings;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ViewComponentTextStyle getTextStyle() {
        return textStyle;
    }

    public ViewComponentBackgroundParams getBackgroundParams() {
        return backgroundParams;
    }

    public InputConfig getInputConfig() {
        return inputConfig;
    }

    @Override
    public String toString() {
        return "ViewComponentParams{" +
                "height=" + height +
                ", width=" + width +
                ", gravity=" + gravity +
                ", margins=" + margins +
                ", textStyle=" + textStyle +
                ", paddings=" + paddings +
                ", imageUrl='" + imageUrl + '\'' +
                ", backgroundParams=" + backgroundParams +
                '}';
    }
}
