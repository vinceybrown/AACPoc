package com.example.brownv4.aacpoc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vincent.brown on 6/8/17.
 */

public class Observations {

    @SerializedName("notice")
    @Expose
    private List<Notice> notice = null;
    @SerializedName("header")
    @Expose
    private List<Header> header = null;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public List<Notice> getNotice() {
        return notice;
    }

    public void setNotice(List<Notice> notice) {
        this.notice = notice;
    }

    public List<Header> getHeader() {
        return header;
    }

    public void setHeader(List<Header> header) {
        this.header = header;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
