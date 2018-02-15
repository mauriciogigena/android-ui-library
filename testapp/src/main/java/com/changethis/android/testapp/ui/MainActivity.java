package com.changethis.android.testapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.changethis.android.testapp.R;
import com.changethis.android.testapp.utils.Components;
import com.changethis.android.testapp.utils.JsonProcessor;
import com.changethis.android.ui.model.dto.component.Component;
import com.changethis.android.ui.views.components.base.ViewComponentFactory;
import com.changethis.android.ui.views.components.textinputlayout.CustomTextInput;
import com.changethis.android.ui.views.components.textview.CustomTextView;

import static com.changethis.android.ui.views.ComponentTypes.TEXTINPUTLAYOUT;
import static com.changethis.android.ui.views.ComponentTypes.TEXTVIEW;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCompomnent();
    }

    private void showCompomnent() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_container);
        Components components = JsonProcessor.getInstance().processComponentJson(this);
        View viewToAdd = null;
        ViewComponentFactory factory;
        for (Component component : components.getComponents()) {
            switch (component.getType()) {
                case TEXTVIEW:
                    factory = new CustomTextView();
                    viewToAdd = factory.crateView(this, component);
                    break;
                case TEXTINPUTLAYOUT:
                    factory = new CustomTextInput();
                    viewToAdd = factory.crateView(this, component);
                    break;
            }
            if (viewToAdd != null) {
                linearLayout.addView(viewToAdd);
            }
            viewToAdd = null;
        }


    }
}
