package com.mike.exampleretrofit.domain

import com.mike.exampleretrofit.data.QuoteRepository
import com.mike.exampleretrofit.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor
    (private val repository:QuoteRepository) {

    suspend operator fun invoke(): List<QuoteModel>? {
        return repository.getAllQuote()
    }
}