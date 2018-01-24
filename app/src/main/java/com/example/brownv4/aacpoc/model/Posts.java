package com.example.brownv4.aacpoc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vincent.brown on 6/8/17.
 */

public class Posts {

    @SerializedName("observations")
    @Expose
    private Observations observations;

    public Observations getObservations() {
        return observations;
    }

    public void setObservations(Observations observations) {
        this.observations = observations;
    }
}
