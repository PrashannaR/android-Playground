package com.prashanna.androidplayground.utils

import com.prashanna.androidplayground.utils.Constants.baseURL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    fun <T> createService(serviceClass: Class<T>): T {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(serviceClass)
    }
}
