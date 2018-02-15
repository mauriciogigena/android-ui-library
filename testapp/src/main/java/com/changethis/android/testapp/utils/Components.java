package com.changethis.android.testapp.utils;

import com.changethis.android.ui.model.dto.component.Component;

import java.util.List;

/**
 * first approach to step class
 * Created by mgigena on 14/2/18.
 */

public class Components {
    private final List<Component> components;

    public Components(List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents() {
        return components;
    }
}
