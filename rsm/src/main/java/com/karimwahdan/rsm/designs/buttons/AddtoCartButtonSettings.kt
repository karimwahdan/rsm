package com.karimwahdan.rsm.designs.buttons

import com.squareup.moshi.Json

data class AddtoCartButtonSettings(
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

    @Json(name = "font_color")
    var font_color:String?,


)
