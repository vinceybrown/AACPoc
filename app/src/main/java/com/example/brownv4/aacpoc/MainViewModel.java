package com.example.brownv4.aacpoc;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.brownv4.aacpoc.model.BomModel;
import com.example.brownv4.aacpoc.repo.BomServiceResponse;
import com.example.brownv4.aacpoc.repo.WeatherRepo;
import com.example.brownv4.aacpoc.repo.WeatherRepoCallback;

/**
 * Created by brownv4 on 24/1/18.
 */

public class MainViewModel extends ViewModel {

    private MutableLiveData<BomModel> liveBomModel = new MutableLiveData<>();
    private WeatherRepo weatherRepo;

    public MainViewModel() {
    }

    MainViewModel(WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    MutableLiveData<BomModel> getLiveBomModel() {
        return liveBomModel;
    }

    void requestWeather() {
        liveBomModel = new MutableLiveData<>();
        weatherRepo.get(new WeatherRepoCallback() {
            @Override
            public void response(BomServiceResponse data) {
                System.out.println("Got weather!");
                liveBomModel.postValue(data.getModel());
            }
        });
    }
}
