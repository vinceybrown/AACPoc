package com.example.brownv4.aacpoc.model.dataservice;


import com.example.brownv4.aacpoc.model.dataservice.apis.BomApi;

/**
 * Created by vincent.brown on 7/8/17.
 */

public class BomWeatherService {
    public static final String BASE_URL = "http://www.bom.gov.au/fwo/IDV60801/IDV60801.94866.json/";

    public static BomApi getApiService() {
        return RestClient.getClient(BASE_URL).create(BomApi.class);
    }
}
