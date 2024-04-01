package com.karimwahdan.rsm.designs.bars

import com.squareup.moshi.Json

data class TopBarSettings(
    @Json(name = "id")
    var id:Int?,

    @Json(name = "project_id")
    var projectId:Int?,

    @Json(name = "bg_1")
    var background:String?,

    @Json(name = "icon_bg")
    var icon_bg:String?,

    @Json(name = "user_icon")
    var user_icon:String?,

    @Json(name = "search_icon")
    var search_icon:String?,

    @Json(name = "list_icon")
    var list_icon:String?,

    @Json(name = "grid_icon")
    var grid_icon:String?,

    @Json(name = "cart_icon")
    var cart_icon:String?,

    @Json(name = "username_font_color")
    var username_font_color:String?,

    @Json(name = "username_font_size")
    var username_font_size:Int?,

)
