package com.learnwithsajib.productapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learnwithsajib.productapi.api.RetrofitClient
import com.learnwithsajib.productapi.databinding.FragmentAllProductBinding
import com.learnwithsajib.productapi.models.ProductItem
import com.learnwithsajib.productapi.ui.ProductAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class AllProductFragment : Fragment() {

    lateinit var binding: FragmentAllProductBinding
    lateinit var adapter: ProductAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentAllProductBinding.inflate(inflater,container,false)


       var callapiservice=RetrofitClient.service.getAllProducts()

adapter=ProductAdapter(requireContext())
        callapiservice.enqueue(object : Callback<List<ProductItem>> {
            override fun onFailure(call: Call<List<ProductItem>>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<List<ProductItem>>?, response: Response<List<ProductItem>>?) {

                if (response != null) {
                    if (response.code()==200) {
                        adapter.submitList(response.body())
                    }
                }
            }



        })

binding.Recyclerviewid.adapter=adapter

        return binding.root
    }


}