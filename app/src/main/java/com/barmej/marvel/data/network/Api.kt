package com.barmej.marvel.data.network

import com.barmej.marvel.util.Constant.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Query


object Api {
    private val interceptor = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
        @Query("ts") apiKet: String = Constant.ts,
        @Query("apikey") ts: String = Constant.API_KEY,
        @Query("hash") hash: String = Constant.hash(),
        @Query("limit") limit: String = Constant.limit,


    }
    private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val marvelService: MarvelApiService = retrofit.create(MarvelApiService::class.java)
    //val triviaService: TriviaService = retrofit.create(TriviaService::class.java)
}