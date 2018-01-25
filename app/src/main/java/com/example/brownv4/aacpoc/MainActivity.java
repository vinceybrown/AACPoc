package com.example.brownv4.aacpoc;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.brownv4.aacpoc.model.BomModel;
import com.example.brownv4.aacpoc.model.Datum;
import com.example.brownv4.aacpoc.model.dataservice.BomWeatherService;
import com.example.brownv4.aacpoc.repo.WeatherRepo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private MainViewModel viewModel;
    private SwipeRefreshLayout swipeRefreshLayout;
    private TextView refreshTimeStamp;
    private List<Datum> weatherData;
    private WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        MainViewModelFactory factory =
                new MainViewModelFactory(new WeatherRepo(BomWeatherService.getApiService(), getString(R.string.bom_url)));
        viewModel = ViewModelProviders.of(this, factory).get(MainViewModel.class);
        subscribe();
    }

    private void init() {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView weatherInfoList = findViewById(R.id.list);
        swipeRefreshLayout = findViewById(R.id.swipe_refresh);
        refreshTimeStamp = findViewById(R.id.refresh_time);
        swipeRefreshLayout.setOnRefreshListener(this);
        weatherInfoList.setLayoutManager(layoutManager);

        String timeStamp = "";
        weatherData = new ArrayList<>();

        weatherAdapter = new WeatherAdapter(this, weatherData, new CellColourProvider(this));
//        setRefreshTime(timeStamp);
        weatherInfoList.setAdapter(weatherAdapter);
    }

    private void subscribe() {
        final Observer<BomModel> elapsedTimeObserver = new Observer<BomModel>() {
            @Override
            public void onChanged(@Nullable final BomModel data) {
                System.out.println("Weather received");
                update(data);
            }
        };

        viewModel.getLiveBomModel().observe(this, elapsedTimeObserver);
    }

    @Override
    public void onRefresh() {
        viewModel.requestWeather();
    }

    public void update(BomModel bomModel) {
        String timeStamp = bomModel.getObservations().getHeader().get(0).getRefreshMessage();
        weatherData = bomModel.getObservations().getData();
        weatherAdapter.updateWeatherData(weatherData);
//        setRefreshTime(timeStamp);
        swipeRefreshLayout.setRefreshing(false);
    }
}
