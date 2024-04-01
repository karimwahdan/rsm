package com.karimwahdan.rsm.product

import com.squareup.moshi.Json

data class ProductImage(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="product_id")
    var product_id:Int?,
    @Json(name="image")
    var image:String?,
    @Json(name="title")
    var title:String?,
    @Json(name="description")
    var description:String?,
    
)
