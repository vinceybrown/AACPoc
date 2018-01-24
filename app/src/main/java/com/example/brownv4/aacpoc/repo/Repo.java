package com.example.brownv4.aacpoc.repo;


/**
 * Created by brownv4 on 23/1/18.
 */

public interface Repo<T extends ServiceResponse> {
    T get(RepoCallback callback);
    void refresh();
}
