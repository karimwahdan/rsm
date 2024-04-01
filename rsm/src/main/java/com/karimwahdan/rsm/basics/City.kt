package com.karimwahdan.rsm.basics

import com.squareup.moshi.Json

data class City(
    @Json(name="id")
    var id:Int,
    @Json(name="country_id")
    var country_id:Int,
    @Json(name="name")
    var name:String,
)
