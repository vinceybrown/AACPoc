package com.example.brownv4.aacpoc.repo;


/**
 * Created by brownv4 on 23/1/18.
 */

public interface ServiceResponse <T> {

    T getModel();
    String getError();
    void setError(String error);
}
