package com.karimwahdan.rsm.basics

import com.squareup.moshi.Json

data class Country(
    @Json(name="id")
    var id:Int,
    @Json(name="name")
    var name:String,
)
