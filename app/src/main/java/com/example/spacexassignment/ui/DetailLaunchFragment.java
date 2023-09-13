package com.example.spacexassignment.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.spacexassignment.R;
import com.example.spacexassignment.SpaceXApplication;
import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.databinding.FragmentDetailLaunchBinding;
import com.example.spacexassignment.vm.LaunchViewModel;
import com.example.spacexassignment.vm.LaunchViewModelFactory;

import javax.inject.Inject;

import timber.log.Timber;

public class DetailLaunchFragment extends Fragment {

    @Inject
    public LaunchViewModelFactory launchViewModelFactory;
    private LaunchViewModel launchViewModel;

    private FragmentDetailLaunchBinding fragmentDetailLaunchBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((SpaceXApplication) requireActivity().getApplication()).appComponent.inject(this);
        launchViewModel = new ViewModelProvider(requireActivity(), launchViewModelFactory).get(LaunchViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentDetailLaunchBinding = FragmentDetailLaunchBinding.inflate(inflater, container, false);
        launchViewModel.getSelectedLaunch().observe(getViewLifecycleOwner(), launch -> {
            Timber.i("Launch name :%s", launch.getMissionName());
            showDetails(launch);
        });
        
        launchViewModel.getFavoriteLaunches().observe(getViewLifecycleOwner(), favoriteLaunches -> {
            Timber.i("Size of Favorites %s", favoriteLaunches.size());
        });

        launchViewModel.getAllFavoriteLaunches().observe(getViewLifecycleOwner(), launches -> {
            Timber.i("Size of All Favorites %s", launches.size());
        });

        return fragmentDetailLaunchBinding.getRoot();
    }

    private void showDetails(Launch launch) {
        Glide
                .with(getContext())
                .load(launch.getMissionPatch())
                .placeholder(R.drawable.spacex_placeholder)
                .into(fragmentDetailLaunchBinding.ivLaunchImage);
        fragmentDetailLaunchBinding.tvMissionName.setText(launch.getMissionName());
        fragmentDetailLaunchBinding.tvLaunchDate.setText(launch.getLaunchDateSource());
        fragmentDetailLaunchBinding.tvRocketName.setText(launch.getRocketName());
        fragmentDetailLaunchBinding.tvRocketType.setText(launch.getRocketType());

    }
}