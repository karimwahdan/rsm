package com.karimwahdan.rsm.settings.appearances

import com.squareup.moshi.Json

data class CustomerTopBar(
    @Json(name="id")
    var id:Int,

    @Json(name="project_id")
    var project_id:Int,

    @Json(name="customer_name_color")
    var customer_name_color:String,

    @Json(name="customer_name_font_weight")
    var customer_name_font_weight:String,

    @Json(name="customer_name_font_family")
    var customer_name_font_family:String,

    @Json(name="background_color")
    var background_color:String,

    @Json(name="button_background_color")
    var button_background_color:String,

)
