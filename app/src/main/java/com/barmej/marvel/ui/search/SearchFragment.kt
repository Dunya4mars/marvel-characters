package com.barmej.marvelcharacter.ui.search

import com.barmej.marvelcharacter.R
import com.barmej.marvelcharacter.databinding.FragmentSearhcBinding
import com.barmej.marvelcharacter.ui.base.BaseFragment


class SearchFragment : BaseFragment<FragmentSearhcBinding, SearchViewModel>(){
    override val layoutIdFragment = R.layout.fragment_searhc
    override val viewModelClass = SearchViewModel::class.java

    override fun setup() {
        naveEditHabitDialog()
    }

    private fun naveEditHabitDialog() {

    }
}