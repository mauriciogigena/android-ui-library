package com.changethis.android.ui.views.components.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.changethis.android.ui.model.dto.component.Component;

/**
 * Created by mgigena on 7/2/18.
 */

public interface ViewComponentFactory {

    interface CustomCreator {
        View create();
    }

    /**
     * Create a new widget to show in screen
     *
     * @param context appcontext
     * @param component with viewComponent specification
     * @return
     */
    View crateView(@NonNull Context context, @NonNull Component component);
}
