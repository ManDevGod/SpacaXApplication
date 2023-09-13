package com.example.spacexassignment.di;

import com.example.spacexassignment.data.network.SpacexApiService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    @Provides
    SpacexApiService providesApiService(Retrofit retrofit) {
        return retrofit.create(SpacexApiService.class);
    }

    @Provides
    public Retrofit providesRetrofit() {
        return new Retrofit.Builder().baseUrl("https://api.spacexdata.com/v3/").addConverterFactory(GsonConverterFactory.create()).build();
    }

}
