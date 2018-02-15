package com.changethis.android.ui.model.dto.component.annotations;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.changethis.android.ui.model.dto.component.annotations.CapitalizationTypes.WORD;


/**
 * Created by mgigena on 14/2/18.
 */

@Retention(value = RetentionPolicy.SOURCE)
@StringDef(value = {WORD})
public @interface CapitalizationTypes {
    String WORD = "word";
}
