package com.rikko.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=2d4d95a984191a46da009488ed99ff51")
    fun getMovieList(): Call<MovieResponse>
}