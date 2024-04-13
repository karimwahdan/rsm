package com.karimwahdan.rsm.promotionImages

import com.karimwahdan.rsm.product.Product
import com.squareup.moshi.Json

data class PromotionImage(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="title")
    var title:String?,
    @Json(name="description")
    var description:String?,
    @Json(name="image")
    var image:String?,
    @Json(name="product_id")
    var productId:Int?,
    @Json(name="product")
    var product:Product?


)
