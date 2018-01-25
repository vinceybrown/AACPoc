package com.example.brownv4.aacpoc.repo;


import com.example.brownv4.aacpoc.model.BomModel;

/**
 * Created by brownv4 on 23/1/18.
 */

public class BomServiceResponse implements ServiceResponse<BomModel> {

    String error;
    BomModel model;

    public BomServiceResponse(BomModel model, String error) {
        this.model = model;
        this.error = error;
    }

    @Override
    public BomModel getModel() {
        return model;
    }

    @Override
    public String getError() {
        return error;
    }

    @Override
    public void setError(String error) {
        this.error = error;
    }
}
