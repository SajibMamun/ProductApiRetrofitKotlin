package com.learnwithsajib.productapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learnwithsajib.productapi.api.RetrofitClient
import com.learnwithsajib.productapi.databinding.ActivityMainBinding
import com.learnwithsajib.productapi.models.ProductItem
import com.learnwithsajib.productapi.ui.ProductAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

}}