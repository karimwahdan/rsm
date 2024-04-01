package com.karimwahdan.rsm.privacyPolicy

import com.squareup.moshi.Json

data class PrivacyPolicy(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="title")
    var title:String,
    @Json(name="content")
    var content:String
)
