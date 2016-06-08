package com.google.samples.mysample;

import android.service.headless.HomeService;
import android.util.Log;
import android.view.InputEvent;

/**
 * Implement your device logic here.
 */
public class MyHomeService extends HomeService {
    private static final String TAG = "MyHomeService";

    @Override
    public void onCreate() {
        Log.d(TAG, "Headless service created");
    }

    @Override
    public void onInputEvent(InputEvent event) {
        Log.d(TAG, "Input event received: " + event);
    }

}
