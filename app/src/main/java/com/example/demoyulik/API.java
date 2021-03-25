package com.example.demoyulik;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface API {
    @POST("auth/login")
    Call<com.example.demoyulik.AuthParam> doAuth(@Body com.example.demoyulik.AuthParam authParam);
}
