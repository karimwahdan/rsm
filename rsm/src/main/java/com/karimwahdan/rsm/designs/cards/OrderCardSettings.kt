package com.karimwahdan.rsm.designs.cards

import com.squareup.moshi.Json

data class OrderCardSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="labels_font_color")
    var labels_font_color:String?,

    @Json(name="total_items_font_color")
    var total_items_font_color:String?,

    @Json(name="order_price_font_color")
    var order_price_font_color:String?,

    @Json(name="delivery_type_font_color")
    var delivery_type_font_color:String?,

    @Json(name="delivery_type_bg")
    var delivery_type_bg:String?,

    @Json(name="delivery_price_font_color")
    var delivery_price_font_color:String?,

    @Json(name="tax_price_font_color")
    var tax_price_font_color:String?,

    @Json(name="total_price_font_color")
    var total_price_font_color:String?,

    @Json(name="grand_total_font_color")
    var grand_total_font_color:String?,

    @Json(name="grand_total_bg")
    var grand_total_bg:String?,


)
