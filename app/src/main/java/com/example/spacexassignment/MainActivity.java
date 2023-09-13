package com.example.spacexassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.spacexassignment.ui.adapter.LaunchListAdapter;
import com.example.spacexassignment.vm.LaunchViewModel;
import com.example.spacexassignment.vm.LaunchViewModelFactory;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}