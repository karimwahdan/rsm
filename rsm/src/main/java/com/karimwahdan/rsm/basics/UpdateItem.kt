package com.karimwahdan.rsm.basics

import com.squareup.moshi.Json

data class UpdateItem(
    @Json(name="id")
    var id:Int,

    @Json(name="project_id")
    var project_id:Int,

    @Json(name="version_no")
    var versionCode:Int,

)
