package com.changethis.android.ui.model.dto.component.style;

/**
 * Created by mgigena on 9/2/18.
 */

public class ViewComponentPaddings {
    private final int top;
    private final int bottom;
    private final int left;
    private final int right;

    public ViewComponentPaddings(int top, int bottom, int left, int right) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}
