package com.changethis.android.ui.views.components.textview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.TextView;

import com.changethis.android.ui.model.dto.component.Component;
import com.changethis.android.ui.views.components.base.ViewComponentFactory;
import com.changethis.android.ui.views.components.base.ViewComponentStyleCreator;

import static com.changethis.android.ui.model.dto.component.annotations.ComponentTypes.TEXTVIEW;

/**
 * Created by mgigena on 7/2/18.
 */

public class CustomTextView implements ViewComponentFactory {

    @Override
    public TextView crateView(@NonNull Context context, @NonNull Component component) {
        TextView textView = (TextView) new ViewComponentStyleCreator(TEXTVIEW, context, component).create();
        return textView;
    }
}
