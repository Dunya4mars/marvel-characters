package com.barmej.marvel.util

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.barmej.marvel.data.State
import com.barmej.marvel.ui.base.BaseAdapter


@BindingAdapter("app:isLoading")
fun <T> showWhenLoading(view: View, state: State<T>?) {
    if (state is State.Loading){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}
//@BindingAdapter("app:isLoading")
//fun <T> showWhenLoading(view: View, state: State<T>?) {
//    view.isVisible = state is State.Loading
//}

@BindingAdapter("app:isSuccess")
fun <T> showWhenSuccess(view: View, state: State<T>?) {
    if (state is State.Success){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}

@BindingAdapter("app:isFail")
fun <T> showWhenFail(view: View, state: State<T>?) {
    if (state is State.Failure){
        view.visibility = View.VISIBLE
    }else{
        view.visibility = View.GONE
    }
}

@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerItems(view: RecyclerView, items:List<T>?) {
    if (items != null){
        (view.adapter as BaseAdapter<T>?)?.setItems(items)
    }else
        (view.adapter as BaseAdapter<T>?)?.setItems((emptyList()))
}