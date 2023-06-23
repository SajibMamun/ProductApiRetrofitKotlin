package com.learnwithsajib.productapi.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {

    private var retrofit=Retrofit.Builder()
        .baseUrl("https://makeup-api.herokuapp.com/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service= retrofit.create(ServiceClients::class.java)
}