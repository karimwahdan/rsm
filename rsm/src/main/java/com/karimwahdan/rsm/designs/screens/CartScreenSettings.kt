package com.karimwahdan.rsm.designs.screens

import com.squareup.moshi.Json

data class CartScreenSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,

    @Json(name="main_bg")
    var main_bg:String?,

    @Json(name="total_price_bg")
    var total_price_bg:String?,

    @Json(name="price_font_color")
    var price_font_color:String?,

    @Json(name="items_font_color")
    var items_font_color:String?,

)
