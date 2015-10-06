package com.y29.appexperiments.di.component;

import android.app.Activity;

import com.y29.appexperiments.di.PerActivity;
import com.y29.appexperiments.di.module.ActivityModule;

import dagger.Component;

/**
 * A base component upon which fragment's components may depend.  Activity-level components
 * should extend this component.
 */
@PerActivity // Subtypes of AbstractActivityComponent should be decorated with @PerActivity.
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface AbstractActivityComponent {
    Activity activity(); // Expose the activity to sub-graphs.
}