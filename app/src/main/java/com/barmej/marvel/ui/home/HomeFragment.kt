package com.barmej.marvel.ui.home

import com.barmej.marvel.R
import com.barmej.marvel.databinding.FragmentHomeBinding
import com.barmej.marvel.databinding.FragmentSearhcBinding
import com.barmej.marvel.ui.base.BaseFragment
import com.barmej.marvel.ui.search.SearchViewModel


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(){
    override val layoutIdFragment = R.layout.fragment_home
    override val viewModelClass = HomeViewModel::class.java
    override fun setup() {
        TODO("Not yet implemented")
    }


}
