package com.karimwahdan.rsm.designs.screens

import com.squareup.moshi.Json

data class SubCategoryScreenSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="bg_1")
    var bg_1:String?,
    @Json(name="bg_2")
    var bg_2:String?,
)
