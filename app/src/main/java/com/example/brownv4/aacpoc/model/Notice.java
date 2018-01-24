package com.example.brownv4.aacpoc.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vincent.brown on 6/8/17.
 */


public class Notice {

    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("copyright_url")
    @Expose
    private String copyrightUrl;
    @SerializedName("disclaimer_url")
    @Expose
    private String disclaimerUrl;
    @SerializedName("feedback_url")
    @Expose
    private String feedbackUrl;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getCopyrightUrl() {
        return copyrightUrl;
    }

    public void setCopyrightUrl(String copyrightUrl) {
        this.copyrightUrl = copyrightUrl;
    }

    public String getDisclaimerUrl() {
        return disclaimerUrl;
    }

    public void setDisclaimerUrl(String disclaimerUrl) {
        this.disclaimerUrl = disclaimerUrl;
    }

    public String getFeedbackUrl() {
        return feedbackUrl;
    }

    public void setFeedbackUrl(String feedbackUrl) {
        this.feedbackUrl = feedbackUrl;
    }

}
