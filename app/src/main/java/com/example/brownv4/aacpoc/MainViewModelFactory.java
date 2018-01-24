package com.example.brownv4.aacpoc;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.brownv4.aacpoc.repo.WeatherRepo;

/**
 * Created by brownv4 on 24/1/18.
 */

public class MainViewModelFactory implements ViewModelProvider.Factory {

    private WeatherRepo weatherRepo;

    public MainViewModelFactory(WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(weatherRepo);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
