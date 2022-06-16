package com.mike.exampleretrofit.data.model

import com.google.gson.annotations.SerializedName

//paso 1: modelo de datos
data class QuoteModel(@SerializedName("quote")var quote:String,@SerializedName("author") val author:String )
