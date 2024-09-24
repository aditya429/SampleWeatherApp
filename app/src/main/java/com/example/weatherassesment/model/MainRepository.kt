package com.example.weatherassesment.model

import com.example.weatherassesment.rest.WeatherRetrofitConfig

class MainRepository(private val retrofitService: WeatherRetrofitConfig) {

    fun fetchCity(city: String) = retrofitService.fetchCity(city)

    fun fetchLocationPhone(lat: String, lon: String) = retrofitService.fetchLocationPhone(lat, lon)
}