package com.anonymous.olamap

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query


// Not using this Right now

interface APIInterface {

    @POST("routing/v1/directions")
   fun getDirections(
        @Query("origin") origin: String,
        @Query("destination") destination: String,
        @Query("api_key") apiKey: String
    ): Call<DirectionsResponse>



}