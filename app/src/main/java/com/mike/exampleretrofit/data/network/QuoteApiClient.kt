package com.mike.exampleretrofit.data.network

import com.mike.exampleretrofit.data.model.QuoteModel
import retrofit2.Response

import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}