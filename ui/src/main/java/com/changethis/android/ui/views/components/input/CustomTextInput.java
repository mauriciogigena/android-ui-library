package com.changethis.android.ui.views.components.input;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.LinearLayout;

import com.changethis.android.ui.model.dto.component.Component;
import com.changethis.android.ui.views.components.base.ViewComponentFactory;
import com.changethis.android.ui.views.components.base.ViewComponentStyleCreator;

import static com.changethis.android.ui.model.dto.component.annotations.ComponentTypes.NORMAL_INPUT;

/**
 * Custom textInputLayout
 * Created by mgigena on 7/2/18.
 */

public class CustomTextInput implements ViewComponentFactory {

    @Override
    public View crateView(@NonNull Context context, @NonNull Component component) {
        LinearLayout inputText = (LinearLayout) new ViewComponentStyleCreator(NORMAL_INPUT, context, component).create();
        return inputText;
    }
}
