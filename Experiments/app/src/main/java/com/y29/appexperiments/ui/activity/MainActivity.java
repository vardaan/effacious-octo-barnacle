package com.y29.appexperiments.ui.activity;

import android.content.Context;
import android.os.Bundle;

import com.y29.appexperiments.R;
import com.y29.appexperiments.di.component.DaggerMainComponent;
import com.y29.appexperiments.di.module.ActivityModule;
import com.y29.appexperiments.presenter.MainPresenterImpl;
import com.y29.appexperiments.ui.base.BaseActivity;
import com.y29.appexperiments.ui.view.MainView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainView {


    @Inject
    MainPresenterImpl presenter; //MainPresenter will not be injected using Construction injection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerMainComponent.builder()
                .appComponent(getAppComponent())
                .activityModule(new ActivityModule(this))
                .build().inject(this);  // comment this ,will not inject presenter
        presenter.setView(this);
        presenter.getMovies();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }


    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public Context getContext() {
        return this;
    }
}
