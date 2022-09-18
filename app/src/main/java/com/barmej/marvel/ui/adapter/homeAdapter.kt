package com.barmej.marvel.ui.adapter

import com.barmej.marvel.R
import com.barmej.marvel.ui.base.BaseAdapter

import com.barmej.marvel.ui.base.BaseInteractionListener

class HabitAdapter(items:List<Habit>,listener:HabitInteractionListener): BaseAdapter<Habit>(items, listener){
    override val layoutID: Int = R.layout.item_edit_habit
}
interface HabitInteractionListener:BaseInteractionListener {
    fun onDeleteHabit(habit: Habit)
    fun onCardClick()
}
