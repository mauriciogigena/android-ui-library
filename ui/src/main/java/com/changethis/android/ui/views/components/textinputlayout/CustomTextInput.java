package com.changethis.android.ui.views.components.textinputlayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;

import com.changethis.android.ui.model.dto.component.Component;
import com.changethis.android.ui.views.components.base.ViewComponentFactory;
import com.changethis.android.ui.views.components.base.ViewComponentStyleCreator;

import static com.changethis.android.ui.views.ComponentTypes.TEXTINPUTLAYOUT;

/**
 * Custom textInputLayout
 * Created by mgigena on 7/2/18.
 */

public class CustomTextInput implements ViewComponentFactory {

    @Override
    public View crateView(@NonNull Context context, @NonNull Component component) {
        EditText editText = (EditText) new ViewComponentStyleCreator(TEXTINPUTLAYOUT, context, component).create();
        return editText;
    }
}
