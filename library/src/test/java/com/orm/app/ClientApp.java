package com.orm.app;

import android.app.Application;

import com.orm.SugarContext;

public class ClientApp extends Application {
    private static final Class<?>[] CLASSES = new Class[]{};
    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this, CLASSES);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        SugarContext.terminate();
    }
}
