package com.barmej.marvel.ui.home

import androidx.lifecycle.MutableLiveData
import com.barmej.marvel.R
import com.barmej.marvel.data.State
import com.barmej.marvel.data.model.character.CharacterResponse
import com.barmej.marvel.data.network.MarvelRepository
import com.barmej.marvel.databinding.FragmentHomeBinding
import com.barmej.marvel.ui.base.BaseFragment
import com.barmej.marvelcharacter.ui.home.HomeViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(){
    override val layoutIdFragment = R.layout.fragment_home
    override val viewModelClass = HomeViewModel::class.java

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