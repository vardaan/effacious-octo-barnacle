package com.y29.appexperiments.ui.base;

import android.app.Application;
import android.content.Context;

import com.y29.appexperiments.di.component.AppComponent;
import com.y29.appexperiments.di.component.DaggerAppComponent;
import com.y29.appexperiments.di.module.ApplicationModule;
import com.y29.appexperiments.di.module.DataModule;

/**
 * Created by krishan on 10/12/14.
 * This is the Base application class that provides global application instance.
 */
public abstract class BaseApp extends Application {


    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .dataModule(new DataModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static BaseApp get(Context context) {
        return (BaseApp) context.getApplicationContext();
    }

}