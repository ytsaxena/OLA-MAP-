package com.anonymous.olamap

import okhttp3.Interceptor
import okhttp3.Response


class ATI(private val token: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder().header("Authorization", "Bearer $token").build()
        return chain.proceed(request)
    }
}
