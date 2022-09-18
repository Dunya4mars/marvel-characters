package com.barmej.marvel.ui.favorte

import com.barmej.marvel.R
import com.barmej.marvel.databinding.FragmentFavorteBinding
import com.barmej.marvel.ui.base.BaseFragment
import com.example.onemillonwinner.FavortyViewModel

class FavortyFragment : BaseFragment<FragmentFavorteBinding, FavortyViewModel>(){
    override val layoutIdFragment = R.layout.fragment_favorte
    override val viewModelClass = FavortyViewModel::class.java

    override fun setup() {
        naveEditHabitDialog()
    }

    private fun naveEditHabitDialog() {

    }
}