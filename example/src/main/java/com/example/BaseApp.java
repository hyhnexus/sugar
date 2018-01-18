package com.example;

import android.app.Application;

import com.example.entity.TestEntity;
import com.facebook.stetho.Stetho;
import com.orm.SugarContext;

/**
 * Created by huanhuan on 2018/1/18.
 */
public class BaseApp extends Application {
    private static final Class<?>[] CLASSES = new Class<?>[]{TestEntity.class};

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this, CLASSES);
        Stetho.initializeWithDefaults(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        SugarContext.terminate();
    }
}