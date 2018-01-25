package com.example.brownv4.aacpoc;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.brownv4.aacpoc.model.Datum;

import java.util.List;

/**
 * Created by vincent.brown on 7/8/17.
 */

public class WeatherAdapter extends RecyclerView.Adapter {

    private List<Datum> weatherData;
    private Context context;
    private CellColourProvider colourProvider;

    public WeatherAdapter(Context context,
                          List<Datum> weatherData,
                          CellColourProvider colourProvider) {
        this.weatherData = weatherData;
        this.context = context;
        this.colourProvider = colourProvider;
    }

    private static class AdapterViewHolder extends RecyclerView.ViewHolder {

        private final TextView textTemp;
        private final TextView textObservation;
        private final TextView windSpeed;
        private final TextView time;
        private final ConstraintLayout cell;

        private AdapterViewHolder(View itemView) {
            super(itemView);
            textTemp = (TextView) itemView.findViewById(R.id.temp);
            textObservation = (TextView) itemView.findViewById(R.id.weather_observation);
            windSpeed = (TextView) itemView.findViewById(R.id.wind_speed);
            time = (TextView) itemView.findViewById(R.id.time);
            cell = (ConstraintLayout) itemView.findViewById(R.id.container);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_row, parent, false);
        return new WeatherAdapter.AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final WeatherAdapter.AdapterViewHolder cellHolder = (WeatherAdapter.AdapterViewHolder) holder;
        int temperature = weatherData.get(position).getAirTemp().intValue();
        int windSpeed = weatherData.get(position).getWindSpdKmh();

        cellHolder.textTemp.setText(context.getString(R.string.degrees_c, temperature));
        cellHolder.textObservation.setText(weatherData.get(position).getCloud());
        cellHolder.windSpeed.setText(context.getString(R.string.kmh, windSpeed));
        cellHolder.time.setText(weatherData.get(position).getLocalDateTime());
        cellHolder.cell.setBackgroundColor(colourProvider.getColourBasedOnTemperature(temperature));
    }

    @Override
    public int getItemCount() {
        return weatherData.size();
    }

    public void updateWeatherData(List<Datum> weatherData) {
        this.weatherData = weatherData;
        notifyDataSetChanged();
    }

}
