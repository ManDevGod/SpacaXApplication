package com.example.spacexassignment.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.spacexassignment.data.model.FavoriteLaunch;
import com.example.spacexassignment.data.model.Launch;

@Database(entities = {Launch.class, FavoriteLaunch.class}, version = 1)
public abstract class LaunchAppDatabase extends RoomDatabase {

    public abstract LaunchDao launchDao();

    public abstract FavoriteDao favoriteDao();

}
