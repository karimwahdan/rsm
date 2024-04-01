package com.karimwahdan.rsm.advertisements

import com.squareup.moshi.Json

data class Advertisement(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="title")
    var title:String?,
    @Json(name="description")
    var description:String?,
    @Json(name="image")
    var image:String?,
    @Json(name="url")
    var url:String?,

)
