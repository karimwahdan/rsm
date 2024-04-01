package com.karimwahdan.rsm.customer

import com.squareup.moshi.Json

data class DeliveryAddressesResponse(
    @Json(name = "data")
    var data:List<DeliveryAddress>?
)
