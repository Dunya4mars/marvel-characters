package com.barmej.marvel.data.model.character


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("resourceURI")
    val resourceURI: String = ""
)