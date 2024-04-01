package com.karimwahdan.rsm.designs.cards

import com.squareup.moshi.Json

data class CartCardSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="bg_2")
    var bg_2:String?,

    @Json(name="title_font_color")
    var title_font_color:String?,

    @Json(name="title_font_size")
    var title_font_size:Int?,

    @Json(name="price_font_color")
    var price_font_color:String?,

    @Json(name="price_font_size")
    var price_font_size:Int?,

    @Json(name="discount_price_font_color")
    var discount_price_font_color:String?,

    @Json(name="discount_price_font_size")
    var discount_price_font_size:Int?,

    @Json(name="total_price_font_color")
    var total_price_font_color:String?,

    @Json(name="total_price_font_size")
    var total_price_font_size:Int?,

    @Json(name="delete_font_color")
    var delete_font_color:String?,

    @Json(name="delete_font_size")
    var delete_font_size:Int?,

    @Json(name="later_font_color")
    var later_font_color:String?,

    @Json(name="later_font_size")
    var later_font_size:Int?,

)
