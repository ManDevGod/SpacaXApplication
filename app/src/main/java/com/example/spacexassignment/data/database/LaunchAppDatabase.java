package com.example.spacexassignment.data.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.spacexassignment.data.model.FavoriteLaunch;
import com.example.spacexassignment.data.model.Launch;

@Database(entities = {Launch.class, FavoriteLaunch.class}, version = 1)
public abstract class LaunchAppDatabase extends RoomDatabase {

    public abstract LaunchDao launchDao();

    public abstract FavoriteDao favoriteDao();

    private static LaunchAppDatabase INSTANCE;

    public static LaunchAppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (LaunchAppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    LaunchAppDatabase.class, "word_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
