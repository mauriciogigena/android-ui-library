package com.changethis.android.ui.model.dto.component;

/**
 * Created by mgigena on 7/2/18.
 */

public class SubComponent {
    private final int id;
    private final String type;
    private final ComponentTextContents textContents;

    public SubComponent(int id, String type, ComponentTextContents textContents) {
        this.id = id;
        this.type = type;
        this.textContents = textContents;
    }
}
