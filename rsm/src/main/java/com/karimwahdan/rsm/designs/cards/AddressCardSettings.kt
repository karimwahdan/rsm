package com.karimwahdan.rsm.designs.cards

import com.squareup.moshi.Json

data class AddressCardSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="bg_normal")
    var bg_normal:String?,

    @Json(name="bg_selected")
    var bg_selected:String?,

    @Json(name="address_name_font_color")
    var address_name_font_color:String?,

    @Json(name="address_type_font_color")
    var address_type_font_color:String?,

    @Json(name="address_type_bg")
    var address_type_bg:String?,

    @Json(name="is_default_font_color")
    var is_default_font_color:String?,

    @Json(name="is_default_bg_color")
    var is_default_bg_color:String?,

    @Json(name="address_details_font_color")
    var address_details_font_color:String?,

    @Json(name="tel_font_color")
    var tel_font_color:String?,

)
