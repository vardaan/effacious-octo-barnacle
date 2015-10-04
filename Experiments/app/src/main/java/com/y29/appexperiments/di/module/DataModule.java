package com.y29.appexperiments.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.y29.appexperiments.data.remote.RestMovieSource;
import com.y29.appexperiments.ui.base.BaseApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ANI on 03-10-2015.
 */
@Module
public class DataModule {


    private static final String PREFS_DEFAULT = "prefExperiments";

    @Singleton
    @Provides
    public RestMovieSource provideRestMovieApi() {
        return new RestMovieSource();
    }

    @Singleton
    @Provides
    public SharedPreferences providePref(BaseApp app){
        return app.getSharedPreferences(PREFS_DEFAULT, Context.MODE_PRIVATE);
    }


}
