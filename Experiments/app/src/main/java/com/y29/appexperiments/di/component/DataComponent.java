package com.y29.appexperiments.di.component;

import com.y29.appexperiments.di.module.DataModule;
import com.y29.appexperiments.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ANI on 03-10-2015.
 */
@Singleton
@Component(modules = DataModule.class)
public interface DataComponent {
    void inject(MainActivity activity);
}
