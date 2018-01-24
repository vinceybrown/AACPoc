package com.example.brownv4.aacpoc.repo;

import android.support.annotation.NonNull;

import com.example.brownv4.aacpoc.model.BomModel;
import com.example.brownv4.aacpoc.model.dataservice.apis.BomApi;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by brownv4 on 23/1/18.
 */

public class WeatherRepo implements Repo<BomServiceResponse> {

    private BomApi bomApi;
    private String apiUrl;
    private BomServiceResponse cacheModel;

    public WeatherRepo(BomApi bomApi, String apiUrl) {
        this.bomApi = bomApi;
        this.apiUrl = apiUrl;
    }

    @Override
    public BomServiceResponse get(@NonNull final RepoCallback callback) {
        if (cacheModel != null) callback.response(cacheModel);
        else {
            bomApi.getBomModel(apiUrl).enqueue(new Callback<BomModel>() {
                final
                @Override
                public void onResponse(Call<BomModel> call, Response<BomModel> response) {
                    if (response.isSuccessful()) {
                        cacheModel = new BomServiceResponse(response.body(), "");
                        callback.response(cacheModel);
                    } else {
                        onFailure(call, new Throwable("API error"));
                    }
                }

                @Override
                public void onFailure(Call<BomModel> call, Throwable t) {
                }
            });
        }
        return null;
    }

    //    @Override
//    public BomServiceResponse get() {
//        if (cacheModel != null) {
//            return Single.just(cacheModel);
//        }
//
//        return Single.create(new SingleOnSubscribe<BomServiceResponse>() {
//            @Override
//            public void subscribe(final SingleEmitter<BomServiceResponse>  emitter) throws Exception {
//
//                bomApi.getBomModel(apiUrl).enqueue(new Callback<BomModel>() {
//                    final
//                    @Override
//                    public void onResponse(Call<BomModel> call, Response<BomModel> response) {
//                        if(response.isSuccessful()) {
//                            cacheModel = new BomServiceResponse(response.body(), "");
//                            emitter.onSuccess(cacheModel);
//                        } else {
//                            onFailure(call,new Throwable("API error"));
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<BomModel> call, Throwable t) {
//                        emitter.onError(t);
//                    }
//                });
//
//            }
//        });
//    }

    @Override
    public void refresh() {

    }
}
