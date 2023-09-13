package com.example.spacexassignment.data.network;

import com.example.spacexassignment.data.model.LaunchItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SpacexApiService {

    @GET("launches")
    Call<List<LaunchItem>> getLaunches();

}
