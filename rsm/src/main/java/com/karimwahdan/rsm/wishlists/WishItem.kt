package com.karimwahdan.rsm.wishlists

import com.karimwahdan.rsm.product.Product
import com.squareup.moshi.Json

data class WishItem(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="customer_id")
    var customer_id:Int?,
    @Json(name="product_id")
    var product_id:Int?,
    @Json(name="product")
    var product: Product?
)
