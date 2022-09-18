package com.barmej.marvel.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.barmej.marvel.util.Event



class HomeViewModel : ViewModel() {
    //private val repository = Repository()

    private val _navigateToGameFragment = MutableLiveData(Event(false))
    val navigateToGameFragment: LiveData<Event<Boolean>>
        get() = _navigateToGameFragment

    fun navigateToGameFragment() {
        _navigateToGameFragment.postValue(Event(true))
    }
}