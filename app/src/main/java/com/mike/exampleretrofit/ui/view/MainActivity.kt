package com.mike.exampleretrofit.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.mike.exampleretrofit.R
import com.mike.exampleretrofit.databinding.ActivityMainBinding
import com.mike.exampleretrofit.ui.viewmodel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint

//paso 4
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //se crea quoteViewModel que extiende de QuoteVIewModel para llamar al MutableLiveData
    // y viewModels() es una libreria que nos da toda la logica de conexion del viewModel al activity
    //como el siclo de vida
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setTheme(R.style.SplashTheme)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        //usamos quoteViewModel para llamar al lIveData que esta almacenada en quoteModel
        //y usamos su funcion del livedata, Observe con dos parametros el owner que somos this y otra
        //dentro de Observer estara engancahdo a live data y cuando sufra un cambio livedata se va ejecutar lo que hay aqui
        //se seteara el valor random de QuoteProvider en estos dos parametros llamandolos por su id
        quoteViewModel.quoteModel.observe(this, Observer {currentCuote ->
            binding.tvQuote.text = currentCuote.quote
            binding.tvAuth.text = currentCuote.author
        })

        quoteViewModel.isLoading.observe(this,Observer{
            binding.progress.isVisible = it
        })

        // se llama al id del layout padre se le asigna un onclickListener que  desde nuestra variable
        //quoteViewModel accederemos a la funcion randomQuote de QuoteViewModel
        binding.container.setOnClickListener{ quoteViewModel.randomQuote()}
    }
}