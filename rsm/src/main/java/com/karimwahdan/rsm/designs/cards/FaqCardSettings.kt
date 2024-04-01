package com.karimwahdan.rsm.designs.cards

import com.squareup.moshi.Json

data class FaqCardSettings(
    @Json(name="id")
    var id:Int?,

    @Json(name="project_id")
    var project_id:Int?,

    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="title_font_color")
    var title_font_color:String?,

    @Json(name="title_font_size")
    var title_font_size:Int?,

    @Json(name="desc_font_color")
    var desc_font_color:String?,

    @Json(name="desc_font_size")
    var desc_font_size:Int?,
)
