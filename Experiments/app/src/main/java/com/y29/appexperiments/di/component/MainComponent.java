package com.y29.appexperiments.di.component;

import com.y29.appexperiments.di.PerActivity;
import com.y29.appexperiments.di.module.ActivityModule;
import com.y29.appexperiments.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by krishan on 6/10/15.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface MainComponent extends AbstractActivityComponent {
    void inject(MainActivity mainActivity);
}
