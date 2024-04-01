package com.karimwahdan.rsm.categories

import com.squareup.moshi.Json

data class Category(
    @Json(name="id")
    var id:Int?,
    @Json(name="name")
    var name:String?,
    @Json(name="description")
    var description:String?,
    @Json(name="image")
    var image:String?
)
