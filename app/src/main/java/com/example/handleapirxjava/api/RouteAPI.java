package com.example.handleapirxjava.api;

import io.reactivex.Flowable;
import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RouteAPI {
    @GET("users/Nurrachmen")
    Single<ResponseBody> dataUsers();
}
