package com.learnwithsajib.productapi.api

import com.learnwithsajib.productapi.models.Product
import retrofit2.Call
import retrofit2.http.GET

interface ServiceClients {

    @GET("products.json?fbclid=IwAR2oedA-K2AKIOYYBKCg-CEwp9csCCdHTQcJj5DNAVdDYvXLzpKiLxSuM1k")
    fun getAllProducts(): Call<Product>
}