package com.example.brownv4.aacpoc;

import android.content.Context;
import android.support.v4.content.ContextCompat;

/**
 * Created by vincent.brown on 7/8/17.
 */

public class CellColourProvider {

    private Context context;

    public CellColourProvider(Context context) {
        this.context = context;
    }

    public int getColourBasedOnTemperature(int temperature) {
        // if there's no match return white.
        int colour = 0xFFFFFF;

        if(temperature <= 5) {
            colour = ContextCompat.getColor(context, R.color.under_five_colour);
        } else if(temperature >= 6 && temperature <= 10) {
            colour = ContextCompat.getColor(context, R.color.between_six_ten);
        } else if(temperature >= 11 && temperature <= 15 ) {
            colour = ContextCompat.getColor(context, R.color.between_eleven_fifteen);
        } else if(temperature >= 16 && temperature <= 20) {
            colour = ContextCompat.getColor(context, R.color.between_sixteen_twenty);
        }  else if(temperature >= 21 && temperature <= 25) {
            colour = ContextCompat.getColor(context, R.color.between_twenty_one_twenty_five);
        }  else if(temperature >= 26 ) {
            colour = ContextCompat.getColor(context, R.color.over_twenty_six);
        }
        return colour;
    }
}