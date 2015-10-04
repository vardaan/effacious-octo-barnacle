package com.y29.appexperiments.presenter;

import android.content.Context;
import android.widget.Toast;

import com.y29.appexperiments.data.model.Movie;
import com.y29.appexperiments.data.remote.RestMovieSource;
import com.y29.appexperiments.ui.base.BaseApp;
import com.y29.appexperiments.ui.view.MainView;

import javax.inject.Inject;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by ANI on 04-10-2015.
 */
public class MainPresenterImpl implements MainPresenter {
    private  MainView mainView;
    CompositeSubscription subscription = new CompositeSubscription();

    @Inject
    RestMovieSource source;

    @Inject
    public MainPresenterImpl() {
    }

    @Override
    public void onCreate(MainView view) {
        mainView=view;
        mainView.showProgress();
        subscription.add(source.getMovieList(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Movie>() {
                    @Override
                    public void onCompleted() {
                        mainView.hideProgress();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mainView.hideProgress();
                    }

                    @Override
                    public void onNext(Movie movie) {
                        Toast.makeText(mainView.getContext(), movie.getStatus_message(), Toast.LENGTH_SHORT).show();
                        mainView.hideProgress();
                    }
                }));
    }

    @Override
    public void onDestroy() {
        if (subscription != null) subscription.unsubscribe();

    }

}
