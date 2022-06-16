package com.mike.exampleretrofit.domain

import com.mike.exampleretrofit.data.QuoteRepository
import com.mike.exampleretrofit.data.model.QuoteModel
import com.mike.exampleretrofit.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor
    (private val repository: QuoteRepository, private val quoteProvider: QuoteProvider) {

    operator fun invoke(): QuoteModel? {
        val quotes = quoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]

        }
        return null
    }
}