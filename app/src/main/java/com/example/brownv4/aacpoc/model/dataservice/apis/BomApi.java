package com.example.brownv4.aacpoc.model.dataservice.apis;

import com.example.brownv4.aacpoc.model.BomModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by vincent.brown on 7/8/17.
 */

public interface BomApi {

    @GET
    Call<BomModel> getBomModel(@Url String url);
}
