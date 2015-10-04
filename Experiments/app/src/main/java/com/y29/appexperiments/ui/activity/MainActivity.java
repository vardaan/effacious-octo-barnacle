package com.y29.appexperiments.ui.activity;

import android.content.Context;
import android.os.Bundle;

import com.y29.appexperiments.R;
import com.y29.appexperiments.presenter.MainPresenterImpl;
import com.y29.appexperiments.ui.base.BaseActivity;
import com.y29.appexperiments.ui.base.BaseApp;
import com.y29.appexperiments.ui.view.MainView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainView {


    @Inject
    MainPresenterImpl presenter; //MainPresenter will not be injected using Construction injection


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseApp.get(this).getAppComponent().inject(this);  // comment this ,will not inject presenter
        presenter.onCreate(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
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
