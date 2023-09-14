package com.example.spacexassignment.di;

import android.content.Context;

import com.example.spacexassignment.ui.DetailLaunchFragment;
import com.example.spacexassignment.ui.ListLaunchFragment;
import com.example.spacexassignment.MainActivity;
import com.example.spacexassignment.data.network.SpacexApiService;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, DatabaseModule.class, UtilModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);

    void inject(ListLaunchFragment listLaunchFragment);

    void inject(DetailLaunchFragment detailLaunchFragment);

    SpacexApiService apiService();

    @Component.Factory
    interface Factory {
        AppComponent create(@BindsInstance Context context);

    }

}
