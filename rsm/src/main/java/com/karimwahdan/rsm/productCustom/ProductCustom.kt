package com.karimwahdan.rsm.productCustom

import com.squareup.moshi.Json

data class ProductCustom(
    @Json(name="id")
    var id:Int,

    @Json(name="project_id")
    var project_id:Int,

    @Json(name="product_id")
    var product_id:Int,

    @Json(name="name")
    var name:String?,

    @Json(name="width")
    var width:Float?,

    @Json(name="length")
    var length:Float?,

    @Json(name="height")
    var height:Float?,

    @Json(name="thickness")
    var thickness:Float?,

    @Json(name="weight")
    var weight:Float?,

    @Json(name="color")
    var color:String?,

    @Json(name="material")
    var material:String?,

    @Json(name="image")
    var image:String?,

    @Json(name="size")
    var size:String?,

    @Json(name="available")
    var available:Int?,

)
