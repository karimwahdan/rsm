package com.karimwahdan.rsm.designs.screens

import com.squareup.moshi.Json

data class SearchScreenSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,

    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="search_field_font_color")
    var search_field_font_color:String?,

    @Json(name="search_field_bg_color")
    var search_field_bg_color:String?,

    @Json(name="search_btn_font_color")
    var search_btn_font_color:String?,

    @Json(name="search_btn_bg_color")
    var search_btn_bg_color:String?,

)
