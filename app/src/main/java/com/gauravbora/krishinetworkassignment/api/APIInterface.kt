package com.gauravbora.krishinetworkassignment.api

import com.gauravbora.krishinetworkassignment.ArticlesModel
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {

    @GET("top-headlines?country=us&apiKey=210fdce7be3049d0ab1121f04c1b6edc")
    fun getArticleData(): Call<ArticlesModel>
}