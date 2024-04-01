package com.karimwahdan.rsm.designs.cards

import com.squareup.moshi.Json

data class OrderItemCardSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="product_name_font_color")
    var product_name_font_color:String?,

    @Json(name="labels_font_color")
    var labels_font_color:String?,

    @Json(name="price_font_color")
    var price_font_color:String?,

    @Json(name="quantity_font_color")
    var quantity_font_color:String?,

    @Json(name="total_value_font_color")
    var total_value_font_color:String?,

)
