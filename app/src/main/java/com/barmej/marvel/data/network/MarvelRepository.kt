package com.barmej.marvel.data.network

import com.barmej.marvel.data.State
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import retrofit2.Response

class MarvelRepository {

    suspend fun getCharacter(): Single<State<MarvelRepository?>> {
        return wrapperWithState(Api.marvelService.getCharacter())
    }

    private fun <T> wrapperWithState(responseGetCharacter: Single<Response<T>>): Single<State<T>> {
        return responseGetCharacter.map {
            if (it.isSuccessful) {
                State.Success(it.body())
            } else {
                State.Failure(it.message())
            }
        }
    }

}

private fun <T> wrapperWithState(function: () -> Observable<Response<T>>): Observable<State<T>> {


