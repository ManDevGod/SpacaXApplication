package com.example.spacexassignment.di;

import com.example.spacexassignment.util.AppExecuter;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilModule {

    @Provides
    AppExecuter providesAppExecuter() {
        return AppExecuter.getInstance();
    }
}
