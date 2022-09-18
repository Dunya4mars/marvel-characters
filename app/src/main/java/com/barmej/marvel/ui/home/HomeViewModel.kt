package com.barmej.marvel.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.barmej.marvel.data.State
import com.barmej.marvel.data.model.character.CharacterResponse
import com.barmej.marvel.data.network.MarvelRepository
import com.barmej.marvel.util.Event
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers


class HomeViewModel : ViewModel() {
    val repository = MarvelRepository()
    val character = MutableLiveData<State<CharacterResponse>>()

    init {
        getRandomJoke()
    }

    private fun getRandomJoke() {
        character.postValue(State.Loading)
        repository.getCharacter()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    State.Success(it.toData())
                    character.postValue(it)
                }, {
                    character.postValue(State.Failure(it.message.toString()))
                })
    }
}