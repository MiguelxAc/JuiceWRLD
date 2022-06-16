package com.mike.exampleretrofit.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mike.exampleretrofit.data.model.QuoteModel
import com.mike.exampleretrofit.domain.GetQuotesUseCase
import com.mike.exampleretrofit.domain.GetRandomQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
//paso 3
// la clase quoteViewModel extiende de ViewModel() implementa la logica del viewModel
@HiltViewModel
class QuoteViewModel @Inject constructor(
    val getRandomQuoteUseCase: GetRandomQuoteUseCase,
    var getQuotesUseCase: GetQuotesUseCase
) : ViewModel() {

    //LiveData permite nuestro activity  suscribirse  a un modelo de datos nuestros que se llama
    // automaticamente cuando se hace un cambio en dicho modelo el modelo de tados que estamos ocupando es QuiteModel
    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()

            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    //se crea una funcion que nos dara un valor random de QuoteProvider osea un author y un quote
    // y se lo dara al MutableLiveData y el MutableLiveData le avisar a al activity que hay cambios
    fun randomQuote() {
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if (quote != null) {
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }

}