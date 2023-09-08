package com.coolweather.android.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

public class MyApplication extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
