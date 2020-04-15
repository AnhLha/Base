package com.example.basemvvm;

import android.app.Application;

import com.google.gson.Gson;

public class BaseApplication extends Application {
    private static BaseApplication sBase;
    public static BaseApplication self(){
        return sBase;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sBase = this;
    }
}
