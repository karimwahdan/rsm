package com.karimwahdan.rsm.designs.cards

import com.squareup.moshi.Json

data class HorizontalProductCardSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="product_name_font_color")
    var product_name_font_color:String?,

    @Json(name="product_name_font_size")
    var product_name_font_size:Int?,

    @Json(name="price_font_color")
    var price_font_color:String?,

    @Json(name="price_font_size")
    var price_font_size:Int?,

    @Json(name="discount_price_font_color")
    var discount_price_font_color:String?,

    @Json(name="discount_price_font_size")
    var discount_price_font_size:Int?,

    @Json(name="desc_font_color")
    var desc_font_color:String?,

    @Json(name="desc_font_size")
    var desc_font_size:Int?,


)
