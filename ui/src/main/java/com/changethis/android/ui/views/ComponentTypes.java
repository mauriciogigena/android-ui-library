package com.changethis.android.ui.views;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.changethis.android.ui.views.ComponentTypes.TEXTINPUTLAYOUT;
import static com.changethis.android.ui.views.ComponentTypes.TEXTVIEW;

/**
 * Created by mgigena on 14/2/18.
 */
@Retention(value = RetentionPolicy.SOURCE)
@StringDef(value = {TEXTVIEW, TEXTINPUTLAYOUT})
public @interface ComponentTypes {
    String TEXTVIEW = "textview";
    String TEXTINPUTLAYOUT = "textinputlayout";
}
