package com.barmej.marvel.data.model.character


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("comics")
    val comics: Comics = Comics(),
    @SerializedName("description")
    val description: String = "",
    @SerializedName("events")
    val events: Events = Events(),
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("modified")
    val modified: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("resourceURI")
    val resourceURI: String = "",
    @SerializedName("series")
    val series: Series = Series(),
    @SerializedName("stories")
    val stories: Stories = Stories(),
    @SerializedName("thumbnail")
    val thumbnail: Thumbnail = Thumbnail(),
    @SerializedName("urls")
    val urls: List<Url> = listOf()
)