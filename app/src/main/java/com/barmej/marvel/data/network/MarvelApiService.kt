package com.barmej.marvel.data.network

import android.provider.SyncStateContract
import com.barmej.marvel.data.model.character.CharacterResponse
import com.barmej.marvel.util.Constant
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApiService {

    @GET("characters")
   suspend fun getCharacter(
        @Query("ts") apiKet: String = Constant.ts,
        @Query("apikey") ts: String = Constant.API_KEY,
        @Query("hash") hash: String = Constant.hash(),
        @Query("limit") limit: String = Constant.limit,

        ): Single<Response<CharacterResponse>>
}
//fun getRandomJoke(): Single<Response<TriviaResponse>>
