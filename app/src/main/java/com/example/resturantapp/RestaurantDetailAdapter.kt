package com.example.resturantapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestaurantDetailAdapter(private val restaurantList: List<RestaurantDetails>) : RecyclerView.Adapter<RestaurantDetailAdapter.RestaurantDetailVH>() {

    class RestaurantDetailVH(itemView: View) : RecyclerView.ViewHolder(itemView){
        val restaurantDpImg: ImageView = itemView.findViewById(R.id.restaurantDP)
        val name : TextView = itemView.findViewById(R.id.restaurantName)
        val description : TextView = itemView.findViewById(R.id.description)
        val rating : TextView = itemView.findViewById(R.id.ratingValue)
        val price : TextView = itemView.findViewById(R.id.startingPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantDetailVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.resturant_card,parent,false)
        return RestaurantDetailVH(itemView)
    }

    override fun onBindViewHolder(holder: RestaurantDetailVH, position: Int) {
        val currentItem = restaurantList[position]

        holder.restaurantDpImg.setImageResource(currentItem.imgSrc)
        holder.name.text = currentItem.name
        holder.description.text = currentItem.description
        holder.rating.text = currentItem.rating
        holder.price.text = currentItem.startingPrice
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }
}