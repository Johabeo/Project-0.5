package com.example.mockinterview.data.api

import android.provider.ContactsContract
import com.example.mockinterview.data.model.Email
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetroAPI {
    @GET("/URL")
    fun getAPI(): Response<List<Email>>

    companion object {
        var BASE_URL = "https://23d2-136-185-8-167.in.ngrok.io/ssblue18/"
        fun create() : RetroAPI {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(RetroAPI::class.java)
        }
    }
}