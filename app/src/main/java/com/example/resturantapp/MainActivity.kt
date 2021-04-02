package com.example.resturantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val restaurantList = ArrayList<RestaurantDetails>()

        addRestaurantDetails(restaurantList)

        val rv: RecyclerView = findViewById(R.id.recyclerView)
        rv.adapter = RestaurantDetailAdapter(restaurantList)
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
    }

    private fun addRestaurantDetails(restaurantList:ArrayList<RestaurantDetails>) {
        for (i in 1..5){
            restaurantList += RestaurantDetails(
                R.drawable.pizza,
                "Pizza Palace",
                "Non-veg, Veg, Authentic italian pizza ",
                "4.5",
                "200")
            restaurantList += RestaurantDetails(
                R.drawable.biriyani,
                "Biriyani Mahal",
                "Quick Bites - Biryani, North Indian, Kebab, Chinese",
                "4.1",
                "150")
            restaurantList += RestaurantDetails(
                R.drawable.burger1,
                "Myntra's Burgers",
                "Non-veg, Veg, cheese burger",
                "4.3",
                "60")
            restaurantList += RestaurantDetails(
                R.drawable.chicken,
                "Chicken Dhaba",
                "Non-veg, Veg, desert",
                "4.6",
                "125")

        }
    }


}