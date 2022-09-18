package com.barmej.marvel.ui.ditels

import com.barmej.marvel.R
import com.barmej.marvel.databinding.FragmentDetalesBinding
import com.barmej.marvel.ui.base.BaseFragment
import com.barmej.marvelcharacter.ui.ditels.DetelsViewModel

class DetalesFragment : BaseFragment<FragmentDetalesBinding, DetelsViewModel>(){
    override val layoutIdFragment = R.layout.fragment_detales
    override val viewModelClass = DetelsViewModel::class.java

    override fun setup() {
        naveEditHabitDialog()
    }

    private fun naveEditHabitDialog() {

    }
}