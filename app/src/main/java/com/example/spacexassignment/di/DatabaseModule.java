package com.example.spacexassignment.di;

import android.content.Context;

import com.example.spacexassignment.data.database.FavoriteDao;
import com.example.spacexassignment.data.database.LaunchAppDatabase;
import com.example.spacexassignment.data.database.LaunchDao;
import com.example.spacexassignment.util.AppExecuter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    @Provides
    @Singleton
    LaunchAppDatabase provideLaunchAppDatabase(Context context) {
        return LaunchAppDatabase.getDatabase(context);
    }

    @Provides
    LaunchDao providesLaunchDao(LaunchAppDatabase appDatabase) {
        return appDatabase.launchDao();
    }

    @Provides
    FavoriteDao providesFavoritesDao(LaunchAppDatabase appDatabase) {
        return appDatabase.favoriteDao();
    }
}