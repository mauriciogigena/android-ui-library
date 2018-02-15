package com.changethis.android.ui.model.dto.component.annotations;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.changethis.android.ui.model.dto.component.annotations.ComponentTypes.NORMAL_INPUT;
import static com.changethis.android.ui.model.dto.component.annotations.ComponentTypes.TEXTVIEW;

/**
 * Created by mgigena on 14/2/18.
 */
@Retention(value = RetentionPolicy.SOURCE)
@StringDef(value = {TEXTVIEW, NORMAL_INPUT})
public @interface ComponentTypes {
    String TEXTVIEW = "textview";
    String NORMAL_INPUT = "normal_input";
}
