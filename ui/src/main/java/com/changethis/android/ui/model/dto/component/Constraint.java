package com.changethis.android.ui.model.dto.component;

/**
 * Created by mgigena on 9/2/18.
 */

public class Constraint {
    private final String type;
    private final String message;
    private final String value;

    public Constraint(String type, String message, String value) {
        this.type = type;
        this.message = message;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getValue() {
        return value;
    }
}
