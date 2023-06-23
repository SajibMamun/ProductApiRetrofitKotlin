package com.learnwithsajib.productapi.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.learnwithsajib.productapi.databinding.ProductItemLayoutBinding
import com.learnwithsajib.productapi.models.ProductItem

class ProductAdapter(var context: Context):ListAdapter<ProductItem,ProductAdapter.ProductViewHolder>(
    comparator)  {

    class ProductViewHolder(var binding: ProductItemLayoutBinding):RecyclerView.ViewHolder(binding.root)



    companion object {

        var comparator = object : DiffUtil.ItemCallback<ProductItem>() {
            override fun areItemsTheSame(oldItem: ProductItem, newItem: ProductItem): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ProductItem, newItem: ProductItem): Boolean {
                return oldItem == newItem
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            ProductItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),parent
            ,false))
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        getItem(position).let {
            holder.binding.productName.text=it.name
            holder.binding.productDescription.text=it.description
            holder.binding.productImage.load(it.imageLink)
            holder.binding.productPrice.text=it.price
            holder.binding.productTags.text=it.category

            }

        }
    }


