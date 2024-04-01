package com.karimwahdan.rsm.designs.buttons

import com.squareup.moshi.Json

data class IncrementButtonSettings(
    @Json(name = "id")
    var id:Int?,

    @Json(name = "project_id")
    var projectId:Int?,

    @Json(name = "bg_1")
    var background:String?,

    @Json(name = "top_left_border_radius")
    var top_left_border_radius:Int?,

    @Json(name = "top_right_border_radius")
    var top_right_border_radius:Int?,

    @Json(name = "bottom_left_border_radius")
    var bottom_left_border_radius:Int?,

    @Json(name = "bottom_right_border_radius")
    var bottom_right_border_radius:Int?,

    @Json(name = "add_font_color")
    var add_font_color:String?,

    @Json(name = "add_bg")
    var add_bg:String?,

    @Json(name = "minus_font_color")
    var minus_font_color:String?,

    @Json(name = "minus_bg")
    var minus_bg:String?,

    @Json(name = "quantity_font_color")
    var quantity_font_color:String?,

)
