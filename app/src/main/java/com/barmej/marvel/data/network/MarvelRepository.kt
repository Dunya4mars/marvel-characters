package com.barmej.marvel.data.network

import com.barmej.marvel.data.State
import com.barmej.marvel.data.model.character.CharacterResponse
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import retrofit2.Response

class MarvelRepository {

    suspend fun getCharacter(): Single<State<MarvelRepository?>> {
        return Api.marvelService.getCharacter().body()
    }

//    suspend fun getRandomJoke() : Flow<jokeReponse?>{
//        return flow {
//        emit(Api.marvelService.getRandomJoke().body())
//    }
//    }

//    suspend fun getRandomJoke() : Response<jokeReponse>
//    {    return Api.apiService.getRandomJoke()
//    }
    //suspend fun getRandomJoke() = Api.apiService.getRandomJoke()

    private fun <T> wrapperWithState(function: () -> Observable<Response<T>>): Observable<State<T>> {
        return function().map {
            if (it.isSuccessful) {
                State.Success(it.body())
            } else {
                State.Failure(it.message())
            }
        }
    }

}
