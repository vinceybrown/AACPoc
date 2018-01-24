package com.example.brownv4.aacpoc.model;

/**
 * Created by vincent.brown on 6/8/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header {

    @SerializedName("refresh_message")
    @Expose
    private String refreshMessage;
    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("main_ID")
    @Expose
    private String mainID;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("state_time_zone")
    @Expose
    private String stateTimeZone;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("state")
    @Expose
    private String state;

    public String getRefreshMessage() {
        return refreshMessage;
    }

    public void setRefreshMessage(String refreshMessage) {
        this.refreshMessage = refreshMessage;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getMainID() {
        return mainID;
    }

    public void setMainID(String mainID) {
        this.mainID = mainID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateTimeZone() {
        return stateTimeZone;
    }

    public void setStateTimeZone(String stateTimeZone) {
        this.stateTimeZone = stateTimeZone;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
