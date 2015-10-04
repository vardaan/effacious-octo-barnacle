package com.y29.appexperiments.di.module;

import android.content.Context;

import com.y29.appexperiments.ui.base.BaseApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ANI on 03-10-2015.
 */

@Module
public class ApplicationModule {

    private final BaseApp application;

    public ApplicationModule(BaseApp application) {
        this.application = application;
    }

    @Provides
    @Singleton
    BaseApp provideApplicationContext() {
        return application;
    }
}
