package com.karimwahdan.rsm.aboutUs

import com.squareup.moshi.Json

data class AboutUs(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="title")
    var title:String,
    @Json(name="content")
    var content:String
)
