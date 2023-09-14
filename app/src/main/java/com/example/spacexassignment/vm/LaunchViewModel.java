package com.example.spacexassignment.vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.spacexassignment.data.model.FavoriteLaunch;
import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.data.model.LaunchItem;
import com.example.spacexassignment.repository.LaunchRepository;

import java.util.List;

import javax.inject.Inject;

public class LaunchViewModel extends ViewModel {

    private LaunchRepository repository;

    private final MutableLiveData<Launch> selectedLaunch = new MutableLiveData<>();

    @Inject
    public LaunchViewModel(LaunchRepository launchRepository) {
        this.repository = launchRepository;
    }

    public void setSelectedLaunch(Launch launch) {
        selectedLaunch.setValue(launch);
    }

    public void setFavorite(Launch launch) {
        repository.setFavoriteLaunch(launch);
    }

    public void deleteFavorite(Launch launch) {
        repository.setFavoriteLaunch(launch);
    }

    public LiveData<Launch> getSelectedLaunch() {
        return selectedLaunch;
    }

    public LiveData<List<Launch>> getLaunches() {
        return repository.getLaunches();
    }

    public LiveData<List<Launch>> getAllFavoriteLaunches() {
        return repository.getAllFavoriteLauches();
    }
}
