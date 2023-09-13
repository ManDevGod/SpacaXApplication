package com.example.spacexassignment.repository;

import androidx.lifecycle.LiveData;

import com.example.spacexassignment.data.database.FavoriteDao;
import com.example.spacexassignment.data.database.LaunchDao;
import com.example.spacexassignment.data.model.FavoriteLaunch;
import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.data.model.LaunchItem;
import com.example.spacexassignment.data.network.SpacexApiService;
import com.example.spacexassignment.util.CommonUtils;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class LaunchRepository {

    private SpacexApiService apiService;
    private LaunchDao launchDao;

    private FavoriteDao favoriteDao;

    @Inject
    public LaunchRepository(SpacexApiService apiService, LaunchDao launchDao, FavoriteDao favoriteDao) {
        this.apiService = apiService;
        this.launchDao = launchDao;
        this.favoriteDao = favoriteDao;
    }

    public LiveData<List<Launch>> getLaunches() {
        new Thread(this::refreshData).start();
        return launchDao.getAll();
    }

    public LiveData<List<FavoriteLaunch>> getFavoriteLaunches() {
        return favoriteDao.getAllFavorites();
    }

    public LiveData<List<Launch>> getAllFavoriteLauches() {
        return favoriteDao.getAllFavoriteLaunches();
    }

    public void setFavoriteLaunch(Launch launch) {
        new Thread(() -> {
            FavoriteLaunch favoriteLaunch = new FavoriteLaunch();
            favoriteLaunch.setFavoriteFlightNumber(launch.getFlightNumber());
            favoriteDao.insert(favoriteLaunch);
        }).start();
    }

    public void refreshData() {
        apiService.getLaunches().enqueue(new Callback<List<LaunchItem>>() {
            @Override
            public void onResponse(Call<List<LaunchItem>> call, Response<List<LaunchItem>> response) {
                if (response != null && response.isSuccessful()) {
                    Timber.tag("Network Response").d("Response Successful");
                    Timber.i("Response is %s", response.body().size());
                    Timber.i("THread name %s", Thread.currentThread().getName());
                    new Thread(() -> {
                        launchDao.insetAll(CommonUtils.mapLaunchItemToLaunch(response.body()));
                    }).start();
                } else {
                    Timber.tag("Network Response").d("Response failed");
                }

            }

            @Override
            public void onFailure(Call<List<LaunchItem>> call, Throwable t) {
                Timber.i("Failed with %s", t.getMessage());
            }
        });
    }

}
