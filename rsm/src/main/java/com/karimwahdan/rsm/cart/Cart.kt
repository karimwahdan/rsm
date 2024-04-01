package com.karimwahdan.rsm.cart

import com.squareup.moshi.Json

data class Cart(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="customer_id")
    var customer_id:Int?,
    @Json(name="order_status_id")
    var order_status_id:Int?,

    @Json(name="items")
    var items:MutableList<CartItem>?
)
