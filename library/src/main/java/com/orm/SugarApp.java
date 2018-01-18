package com.orm;

import android.app.Application;

/**
 * Use {@link SugarContext.init()} instead
 */
@Deprecated
public class SugarApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this, null);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        SugarContext.terminate();
    }
}