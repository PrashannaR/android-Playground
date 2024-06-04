package com.prashanna.androidplayground.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    fun <T> createService(serviceClass: Class<T>, baseUrl: String): T {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(serviceClass)
    }
}
