package com.example.brownv4.aacpoc;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brownv4.aacpoc.model.BomModel;
import com.example.brownv4.aacpoc.model.dataservice.BomWeatherService;
import com.example.brownv4.aacpoc.repo.WeatherRepo;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewModelFactory factory =
                new MainViewModelFactory(new WeatherRepo(BomWeatherService.getApiService(), getString(R.string.bom_url)));
        viewModel = ViewModelProviders.of(this, factory).get(MainViewModel.class);
        subscribe();
        viewModel.requestWeather();
    }

    private void subscribe() {
        final Observer<BomModel> elapsedTimeObserver = new Observer<BomModel>() {
            @Override
            public void onChanged(@Nullable final BomModel aLong) {
                System.out.println("Weather received");
            }
        };

        viewModel.getLiveBomModel().observe(this, elapsedTimeObserver);
    }
}
