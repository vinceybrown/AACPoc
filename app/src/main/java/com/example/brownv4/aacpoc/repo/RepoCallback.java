package com.example.brownv4.aacpoc.repo;

/**
 * Created by brownv4 on 24/1/18.
 */

public interface RepoCallback<T extends ServiceResponse> {
    void response(T data);
}
