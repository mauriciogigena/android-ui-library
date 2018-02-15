package com.changethis.android.ui.views.components.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.changethis.android.ui.model.dto.component.Component;
import com.changethis.android.ui.model.dto.component.style.ViewComponentMargins;
import com.changethis.android.ui.model.dto.component.style.ViewComponentPaddings;
import com.changethis.android.ui.model.dto.component.style.ViewComponentParams;
import com.changethis.android.ui.model.dto.component.annotations.ComponentTypes;
import com.changethis.android.ui.views.components.input.CustomTextInputCreator;
import com.changethis.android.ui.views.components.textview.CustomTextViewCreator;

import static com.changethis.android.ui.model.dto.component.annotations.ComponentTypes.NORMAL_INPUT;
import static com.changethis.android.ui.model.dto.component.annotations.ComponentTypes.TEXTVIEW;

/**
 * Created by mgigena on 9/2/18.
 */

public class ViewComponentStyleCreator {

    private final String viewType;
    private final Context context;
    private final Component component;

    public ViewComponentStyleCreator(@NonNull @ComponentTypes String viewType, @NonNull Context context, @NonNull Component component) {
        this.viewType = viewType;
        this.context = context;
        this.component = component;
    }

    public View create() {
        View view = null;
        ViewComponentFactory.CustomCreator customCreator;
        switch (viewType) {
            case TEXTVIEW:
                customCreator = new CustomTextViewCreator(component.getComponentParams(), component.getTextContents(), context);
                view = customCreator.create();
                break;
            case NORMAL_INPUT:
                customCreator = new CustomTextInputCreator(component.getComponentParams(), component.getTextContents(), context);
                view = customCreator.create();
                break;
        }
        if (view != null) {
            setCommonParams(view);
        }
        return view;
    }

    public void setCommonParams(@NonNull View view) {
        view.setId(component.getId());
        ViewComponentParams params = component.getComponentParams();
        setMargins(view, params.getMargins(), params.getHeight(), params.getWidth());
        setGravity(view, params.getGravity());
        setPaddings(view, params.getPaddings());
    }

    private void setMargins(@NonNull View view, @NonNull ViewComponentMargins margins, @NonNull final int height, @NonNull final int width) {
        LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(width, height);
        linearParams.setMargins(margins.getLeft(), margins.getTop(), margins.getRight(), margins.getBottom());
        view.setLayoutParams(linearParams);
    }

    private void setGravity(@NonNull View view, @NonNull int gravity) {
        switch (viewType) {
            case TEXTVIEW:
                ((TextView) view).setGravity(gravity);
                break;
        }
    }

    private void setPaddings(@NonNull View view, @NonNull ViewComponentPaddings paddings) {
        view.setPadding(paddings.getLeft(), paddings.getTop(), paddings.getRight(), paddings.getBottom());
    }


}
