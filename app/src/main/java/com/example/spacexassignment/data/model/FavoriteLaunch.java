package com.example.spacexassignment.data.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity
public class FavoriteLaunch {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int favoriteFlightNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFavoriteFlightNumber() {
        return favoriteFlightNumber;
    }

    public void setFavoriteFlightNumber(int favoriteFlightNumber) {
        this.favoriteFlightNumber = favoriteFlightNumber;
    }
}
