package com.example.android.dragonlegend.api;

import com.example.android.dragonlegend.model.ItemResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface Service {
    @GET("/Nsikaktopdown/Recipe/master/Recipe")
    Call<ItemResponse> getItems();



}
