package com.karimwahdan.rsm.orders

import com.squareup.moshi.Json

data class AllOrdersResponse(
    @Json(name="data")
    var data:List<Order>?
)
