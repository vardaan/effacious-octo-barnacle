package com.y29.appexperiments.ui.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.y29.appexperiments.di.component.AppComponent;
import com.y29.appexperiments.ui.view.BaseView;

import butterknife.ButterKnife;

/**
 * Created by ANI on 04-10-2015.
 */
public abstract class BaseActivity extends AppCompatActivity implements BaseView {


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayout());
        ButterKnife.bind(this);
    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showProgress() {

    }

    public abstract int getLayout();

    public AppComponent getAppComponent() {
        return BaseApp.get(this).getAppComponent();
    }

}
