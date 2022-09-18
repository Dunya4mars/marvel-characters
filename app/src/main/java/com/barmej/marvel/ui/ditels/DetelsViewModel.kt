package com.barmej.marvelcharacter.ui.ditels


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.barmej.marvelcharacter.util.Event

class DetelsViewModel : ViewModel() {
   // private val repository = Repository()

    private val _navigateToGameFragment = MutableLiveData(Event(false))
    val navigateToGameFragment: LiveData<Event<Boolean>>
        get() = _navigateToGameFragment

//    private val _bestPrize = MutableLiveData<Int>(repository.getBestPrize())
//    val bestPrize: LiveData<Int>
//        get() = _bestPrize


    fun navigateToGameFragment() {
        _navigateToGameFragment.postValue(Event(true))
    }
}