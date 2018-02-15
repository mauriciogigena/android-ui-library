package com.changethis.android.testapp.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.changethis.android.testapp.R;
import com.changethis.android.ui.model.dto.component.Component;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/**
 * Created by mgigena on 14/2/18.
 */

public class JsonProcessor {
    private static final int COMPONENT_RAW = R.raw.component;

    private final static String TAG = JsonProcessor.class.getName();

    private static final JsonProcessor ourInstance = new JsonProcessor();
    private static final int BUFFER_LENGHT = 1024;
    private Context context;

    public static JsonProcessor getInstance() {
        return ourInstance;
    }

    private JsonProcessor() {
    }

    public Components processComponentJson(@NonNull Context context) {
        this.context = context;
        Gson gson = new GsonBuilder().create();
        String json = getJsonFromRawByType(COMPONENT_RAW);

        return gson.fromJson(json, Components.class);
    }

    private String getJsonFromRawByType(@NonNull int rawFile) {
        InputStream is = context.getResources().openRawResource(rawFile);
        Writer writer = new StringWriter();
        char[] buffer = new char[BUFFER_LENGHT];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
            reader.close();
            is.close();
        } catch (UnsupportedEncodingException e) {
            Log.e(TAG, e.getMessage());
        } catch (IOException e) {
            Log.e(TAG, e.getMessage());
        }

        return writer.toString();
    }
}
