package com.nenad.skymoods.model


import com.google.gson.annotations.SerializedName

data class WeatherData(
    @SerializedName("city")
    val city: City,
    @SerializedName("cnt")
    val cnt: Int,
    @SerializedName("cod")
    val cod: String,
    @SerializedName("message")
    val message: Int
)