package com.example.user

import com.example.activity.ActivitiesApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstanceUsers {
    private val baseURL = "https://reqres.in/api/"

    private val retrofitClient = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: UsersApi = retrofitClient.create(UsersApi::class.java)
}