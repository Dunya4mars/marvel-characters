package com.barmej.marvel.data.network

import com.barmej.marvel.data.model.character.CharacterResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET

interface MarvelApiService {

    @GET("characters")
    suspend fun getCharacter(): Single<Response<CharacterResponse>>

}
