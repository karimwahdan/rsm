package com.karimwahdan.rsm.orders

import com.squareup.moshi.Json

data class OrderResponse(
    @Json(name="data")
    var data: Order
)
