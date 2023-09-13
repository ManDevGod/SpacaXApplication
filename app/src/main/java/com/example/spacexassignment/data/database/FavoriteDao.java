package com.example.spacexassignment.data.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.spacexassignment.data.model.FavoriteLaunch;
import com.example.spacexassignment.data.model.Launch;

import java.util.List;

@Dao
public interface FavoriteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(FavoriteLaunch favoriteLaunch);

    @Update
    void update(FavoriteLaunch favoriteLaunch);

    @Delete
    void delete(FavoriteLaunch favoriteLaunch);

    @Query("Select * from favoritelaunch")
    LiveData<List<FavoriteLaunch>> getAllFavorites();

    @Query("SELECT * FROM launch INNER JOIN favoritelaunch ON launch.flightNumber == favoritelaunch.favoriteFlightNumber")
    LiveData<List<Launch>> getAllFavoriteLaunches();

}
