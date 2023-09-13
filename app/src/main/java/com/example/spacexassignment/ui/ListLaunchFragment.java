package com.example.spacexassignment.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spacexassignment.R;
import com.example.spacexassignment.SpaceXApplication;
import com.example.spacexassignment.data.model.Launch;
import com.example.spacexassignment.ui.adapter.LaunchListAdapter;
import com.example.spacexassignment.vm.LaunchViewModel;
import com.example.spacexassignment.vm.LaunchViewModelFactory;

import javax.inject.Inject;

import timber.log.Timber;

public class ListLaunchFragment extends Fragment {

    @Inject
    public LaunchViewModelFactory launchViewModelFactory;
    private LaunchViewModel launchViewModel;
    private LaunchListAdapter launchListAdapter;
    LaunchListAdapter.LaunchItemCLickListener launchItemCLickListener = new LaunchListAdapter.LaunchItemCLickListener() {
        @Override
        public void onLaunchItemClick(Launch launchItem) {
            launchViewModel.setSelectedLaunch(launchItem);
            NavHostFragment.findNavController(ListLaunchFragment.this).navigate(R.id.action_listLaunchFragment_to_detailLaunchFragment);
        }
    };
    private RecyclerView recyclerView;

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
        View view = inflater.inflate(R.layout.fragment_list_launch, container, false);
        recyclerView = view.findViewById(R.id.rv_launch_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        launchListAdapter = new LaunchListAdapter(getContext(), launchItemCLickListener);
        recyclerView.setAdapter(launchListAdapter);
        launchViewModel.getLaunches().observe(getViewLifecycleOwner(), launchItems -> {
            launchListAdapter.updateLaunchesList(launchItems);
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Timber.i("OnResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Timber.i("onStop");
    }
}