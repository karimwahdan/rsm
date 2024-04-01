package com.karimwahdan.rsm.designs.screens

import com.squareup.moshi.Json

data class CreateAddressScreenSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="fields_bg")
    var fields_bg:String?,

    @Json(name="fields_font_color")
    var fields_font_color:String?,

    @Json(name="labels_font_color")
    var labels_font_color:String?,

)
