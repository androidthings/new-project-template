package com.google.samples.iot;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Skeleton of the main Android IoT activity. Implement your device's logic in this class.
 *
 * The recommended way of handling I/O is by starting a new thread. Avoid handling blocking
 * operations in the main thread.
 *
 */
public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
