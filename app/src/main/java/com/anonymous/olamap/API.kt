package com.anonymous.olamap

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



// Not using this Right now

object API {
    private const val BASE_URL = "https://api.olamaps.io"


    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
         //   .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}

object ApiClient {
    val apiinteface: APIInterface by lazy {
        API.retrofit.create(APIInterface::class.java)
    }
}