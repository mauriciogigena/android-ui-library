package com.changethis.android.ui.model.dto.component;

/**
 * Created by mgigena on 7/2/18.
 */

public class ComponentTextContents {
    private final String title;
    private final String text;
    private final String hint;
    private final String errorText;
    private final String onClickText;

    public ComponentTextContents(String title, String text, String hint, String errorText, String onClickText) {
        this.title = title;
        this.text = text;
        this.hint = hint;
        this.errorText = errorText;
        this.onClickText = onClickText;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getHint() {
        return hint;
    }

    public String getErrorText() {
        return errorText;
    }

    public String getOnClickText() {
        return onClickText;
    }

    @Override
    public String toString() {
        return "ComponentTextContents{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", hint='" + hint + '\'' +
                ", errorText='" + errorText + '\'' +
                ", onClickText='" + onClickText + '\'' +
                '}';
    }
}
