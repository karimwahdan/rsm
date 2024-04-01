package com.karimwahdan.rsm.project

import com.squareup.moshi.Json

data class Project(
    @Json(name = "id")
    var id:Int,

    @Json(name = "project_owner_id")
    var project_owner_id:Int,

    @Json(name="project_name")
    var name:String,

    @Json(name="project_unique_code")
    var projectCode:String,
)
