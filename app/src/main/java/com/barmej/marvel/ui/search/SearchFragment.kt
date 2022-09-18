package com.barmej.marvel.ui.search

import com.barmej.marvel.R
import com.barmej.marvel.databinding.FragmentSearhcBinding
import com.barmej.marvel.ui.base.BaseFragment


class SearchFragment : BaseFragment<FragmentSearhcBinding, SearchViewModel>(){
    override val layoutIdFragment = R.layout.fragment_searhc
    override val viewModelClass = SearchViewModel::class.java

    override fun setup() {
        naveEditHabitDialog()
    }

    private fun naveEditHabitDialog() {

    }
}