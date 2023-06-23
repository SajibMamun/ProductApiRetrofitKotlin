package com.learnwithsajib.productapi.api

import com.learnwithsajib.productapi.models.ProductItem
import retrofit2.Call
import retrofit2.http.GET

interface ServiceClients {

    @GET("products.json")
    fun getAllProducts(): Call<List<ProductItem>>
}