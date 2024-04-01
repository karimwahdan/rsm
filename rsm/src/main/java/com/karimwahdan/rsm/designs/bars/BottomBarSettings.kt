package com.karimwahdan.rsm.designs.bars

import com.squareup.moshi.Json

data class BottomBarSettings(
    @Json(name = "id")
    var id:Int?,

    @Json(name = "project_id")
    var projectId:Int?,

    @Json(name = "bg_1")
    var background:String?,

    @Json(name = "icon_bg")
    var icon_bg:String?,

    @Json(name = "home_icon_enabled")
    var home_icon_enabled:String?,

    @Json(name = "home_icon_disabled")
    var home_icon_disabled:String?,

    @Json(name = "categories_icon_enabled")
    var categories_icon_enabled:String?,

    @Json(name = "categories_icon_disabled")
    var categories_icon_disabled:String?,

    @Json(name = "wishlist_icon_enabled")
    var wishlist_icon_enabled:String?,

    @Json(name = "wishlist_icon_disabled")
    var wishlist_icon_disabled:String?,

    @Json(name = "account_icon_enabled")
    var account_icon_enabled:String?,

    @Json(name = "account_icon_disabled")
    var account_icon_disabled:String?,

)
