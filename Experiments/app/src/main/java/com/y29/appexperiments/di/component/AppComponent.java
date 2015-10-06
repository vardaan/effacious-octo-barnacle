package com.y29.appexperiments.di.component;

import com.y29.appexperiments.data.remote.RestMovieSource;
import com.y29.appexperiments.di.module.ApplicationModule;
import com.y29.appexperiments.di.module.DataModule;
import com.y29.appexperiments.ui.base.BaseApp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ANI on 03-10-2015.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class, DataModule.class
})
public interface AppComponent {

    void inject(BaseApp app);

    BaseApp getApp();

    RestMovieSource getRestSource();


}
