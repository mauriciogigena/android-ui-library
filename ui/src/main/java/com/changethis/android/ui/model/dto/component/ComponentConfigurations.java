package com.changethis.android.ui.model.dto.component;

import java.util.List;

/**
 * Created by mgigena on 7/2/18.
 */

public class ComponentConfigurations {
    private final List<String> inputTypes; // check inputType class
    private final boolean hasFocus;
    private final boolean isChecked; // used in checkbox

    public ComponentConfigurations(List<String> inputTypes, boolean hasFocus, boolean isChecked) {
        this.inputTypes = inputTypes;
        this.hasFocus = hasFocus;
        this.isChecked = isChecked;
    }

    public List<String> getInputTypes() {
        return inputTypes;
    }

    public boolean isHasFocus() {
        return hasFocus;
    }

    public boolean isChecked() {
        return isChecked;
    }
}
