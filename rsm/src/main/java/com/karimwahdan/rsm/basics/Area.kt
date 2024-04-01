package com.karimwahdan.rsm.basics

import com.squareup.moshi.Json

data class Area(
    @Json(name="id")
    var id:Int,
    @Json(name="area_id")
    var area_id:Int,
    @Json(name="name")
    var name:String,
)
