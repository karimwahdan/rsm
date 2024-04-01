package com.karimwahdan.rsm.designs.screens

import com.squareup.moshi.Json

data class AboutUsScreenSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="font_color")
    var font_color:String?,

)
