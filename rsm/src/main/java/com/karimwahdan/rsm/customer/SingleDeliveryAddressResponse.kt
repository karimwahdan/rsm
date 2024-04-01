package com.karimwahdan.rsm.customer

import com.squareup.moshi.Json

data class SingleDeliveryAddressResponse(
    @Json(name = "data")
    var data: DeliveryAddress
)
