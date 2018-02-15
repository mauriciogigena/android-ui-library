package com.changethis.android.ui.model.dto.component.annotations;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;

import static com.changethis.android.ui.model.dto.component.annotations.BackgroundType.CIRCLE;
import static com.changethis.android.ui.model.dto.component.annotations.BackgroundType.INPUT;
import static com.changethis.android.ui.model.dto.component.annotations.BackgroundType.NONE;
import static com.changethis.android.ui.model.dto.component.annotations.BackgroundType.RECTANGLE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by mgigena on 15/2/18.
 */
@Retention(value = SOURCE)
@StringDef(value = {CIRCLE, RECTANGLE, NONE, INPUT})
public @interface BackgroundType {
    String CIRCLE = "circle";
    String RECTANGLE = "rectangle";
    String NONE = "none";
    String INPUT = "input"; // only change cursor and underline configurations
}
