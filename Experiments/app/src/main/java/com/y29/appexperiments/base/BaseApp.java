package com.y29.appexperiments.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by krishan on 10/12/14.
 * This is the Base application class that provides global application instance.
 */
public abstract class BaseApp extends Application {
    private static BaseApp instance;

    public static Context getContext() {
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

}