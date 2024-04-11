package com.example.activity

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstanceBoredApi {
    private val baseURL = "http://www.boredapi.com/api/";

    private val retrofitClient = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofitClient.create(ActivitiesApi::class.java)
}