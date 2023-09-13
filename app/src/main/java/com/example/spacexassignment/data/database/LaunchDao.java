package com.example.spacexassignment.data.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.spacexassignment.data.model.Launch;

import java.util.List;

@Dao
public interface LaunchDao {

    @Query("Select * From launch")
    LiveData<List<Launch>> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insetAll(List<Launch> launches);

}
