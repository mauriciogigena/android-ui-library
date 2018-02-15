package com.changethis.android.ui.model.dto.component.annotations;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.changethis.android.ui.model.dto.component.annotations.ComponentType.TITLE;

/**
 * Created by mgigena on 7/2/18.
 */
@Retention(value = RetentionPolicy.SOURCE)
@StringDef(value = {TITLE})
public @interface ComponentType {
    String TITLE = "title";
}
