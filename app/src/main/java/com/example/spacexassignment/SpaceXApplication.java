package com.example.spacexassignment;

import android.app.Application;

import com.example.spacexassignment.di.AppComponent;
import com.example.spacexassignment.di.DaggerAppComponent;

import timber.log.Timber;
import static timber.log.Timber.DebugTree;

public class SpaceXApplication extends Application {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Timber.plant(new DebugTree());
        }
        appComponent = DaggerAppComponent.factory().create(this);
    }


}
