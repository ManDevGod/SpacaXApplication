package com.example.spacexassignment.di;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.example.spacexassignment.data.database.FavoriteDao;
import com.example.spacexassignment.data.database.LaunchAppDatabase;
import com.example.spacexassignment.data.database.LaunchDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    @Provides
    @Singleton
    LaunchAppDatabase provideLaunchAppDatabase(Context context) {
        return Room.databaseBuilder(context, LaunchAppDatabase.class,"launch_database").build();
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
