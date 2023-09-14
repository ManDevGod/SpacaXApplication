package com.example.spacexassignment.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.spacexassignment.data.database.FavoriteDao;
import com.example.spacexassignment.data.database.LaunchDao;
import com.example.spacexassignment.data.model.FavoriteLaunch;
import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.data.model.LaunchItem;
import com.example.spacexassignment.data.network.SpacexApiService;
import com.example.spacexassignment.util.AppExecuter;
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
    private AppExecuter executer;
    private FavoriteDao favoriteDao;

    private LiveData<List<Launch>> launchLiveData;

    private MutableLiveData<List<Launch>> favoriteLaunchLiveData = new MutableLiveData<>();


    @Inject
    public LaunchRepository(SpacexApiService apiService, LaunchDao launchDao, FavoriteDao favoriteDao, AppExecuter executer) {
        this.apiService = apiService;
        this.launchDao = launchDao;
        this.favoriteDao = favoriteDao;
        this.executer = executer;
    }

    public LiveData<List<Launch>> getLaunches() {
        new Thread(this::refreshData).start();
        return launchDao.getAll();
    }

    /*
    Not using this now
     */
    public LiveData<List<FavoriteLaunch>> getFavoriteLaunches() {
        executer.getExecutor().execute(() -> {
            favoriteDao.getAllFavorites();
        });
        return null;
    }

    public LiveData<List<Launch>> getAllFavoriteLauches() {
        return favoriteDao.getAllFavoriteLaunches();
    }

    public void setFavoriteLaunch(Launch launch) {
        executer.getExecutor().execute(() -> {
            FavoriteLaunch favoriteLaunch = new FavoriteLaunch();
            favoriteLaunch.setFavoriteFlightNumber(launch.getFlightNumber());
            favoriteDao.insert(favoriteLaunch);
        });
    }

    public void deleteFavoriteLaunch(Launch launch) {
        executer.getExecutor().execute(() -> {
            FavoriteLaunch favoriteLaunch = new FavoriteLaunch();
            favoriteLaunch.setFavoriteFlightNumber(launch.getFlightNumber());
            favoriteDao.delete(favoriteLaunch);
        });
    }

    public void refreshData() {
        apiService.getLaunches().enqueue(new Callback<List<LaunchItem>>() {
            @Override
            public void onResponse(Call<List<LaunchItem>> call, Response<List<LaunchItem>> response) {
                if (response.body() != null && response.isSuccessful()) {
                    Timber.i("Response is %s", response.body().size());
                    executer.getExecutor().execute(() -> {
                        launchDao.insetAll(CommonUtils.mapLaunchItemToLaunch(response.body()));
                    });
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
