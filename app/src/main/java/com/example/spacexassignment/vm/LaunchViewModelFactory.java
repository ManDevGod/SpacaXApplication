package com.example.spacexassignment.vm;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.spacexassignment.repository.LaunchRepository;

import javax.inject.Inject;

public class LaunchViewModelFactory implements ViewModelProvider.Factory {

    private LaunchRepository repository;

    @Inject
    public LaunchViewModelFactory(LaunchRepository repository) {
        this.repository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(LaunchViewModel.class)) {
            return (T) new LaunchViewModel(repository);
        }
        throw new IllegalArgumentException("Unknown Class...");
    }
}
