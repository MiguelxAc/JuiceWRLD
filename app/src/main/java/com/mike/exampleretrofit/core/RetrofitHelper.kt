package com.mike.exampleretrofit.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://apirest-a8475-default-rtdb.firebaseio.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}