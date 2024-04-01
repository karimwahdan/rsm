package com.karimwahdan.rsm.designs.cards

import com.squareup.moshi.Json

data class IconCardSettings(
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
)
