package com.barmej.marvel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.barmej.marvel.data.State
import com.barmej.marvel.data.model.character.CharacterResponse
import com.barmej.marvel.data.network.MarvelRepository
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {
    val repository = MarvelRepository()
    val character = MutableLiveData<State<CharacterResponse>>()
    init {
        getRandomJoke()
    }
private fun getRandomJoke() {
    viewModelScope.launch {
        val result = repository.getCharacter()
        character.postValue(result.)

    }
}

}
//private fun getRandomJoke() {
//    viewModelScope.launch {
//        repository.getRandomJoke().collect()
//        joke.postValue(it)
//
//    }
//}



//private fun getRandomJoke() {
//    viewModelScope.launch {
//        joke.postValue(Api.apiService.getRandomJoke())
//
//    }
//}

//private fun getRandomJoke() {
//    Api.apiService.getRandomJoke()
//        .subscribeOn(Schedulers.io())
//        .observeOn(AndroidSchedulers.mainThread())
//        .subscribe({
//            joke.postValue(it)
//        },{
//
//        })
//}