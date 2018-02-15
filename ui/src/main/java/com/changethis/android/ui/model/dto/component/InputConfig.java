package com.changethis.android.ui.model.dto.component;

/**
 * Created by mgigena on 14/2/18.
 */

public class InputConfig {

    private final boolean hasFocus;
    private final int inputType;

    public InputConfig(boolean autocorrect, boolean hasFocus, int inputType) {
        this.hasFocus = hasFocus;
        this.inputType = inputType;
    }

    public boolean isHasFocus() {
        return hasFocus;
    }

    public int getInputType() {
        return inputType;
    }
}
