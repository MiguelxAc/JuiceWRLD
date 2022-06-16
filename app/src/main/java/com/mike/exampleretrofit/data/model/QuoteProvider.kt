package com.mike.exampleretrofit.data.model

import javax.inject.Inject
import javax.inject.Singleton

//paso 2:
@Singleton
class QuoteProvider @Inject constructor() {

    //companion object es como una clase estatica, es accesible pero un metodo sera accesible su variable por que es privada
    var quotes: List<QuoteModel> = emptyList()

}