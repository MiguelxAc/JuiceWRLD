package com.mike.exampleretrofit.data

import com.mike.exampleretrofit.data.model.QuoteModel
import com.mike.exampleretrofit.data.model.QuoteProvider
import com.mike.exampleretrofit.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api:QuoteService,private val quoteProvider: QuoteProvider){

    suspend fun getAllQuote():List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}