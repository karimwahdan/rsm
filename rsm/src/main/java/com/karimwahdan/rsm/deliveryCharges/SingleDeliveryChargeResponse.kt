package com.karimwahdan.rsm.deliveryCharges

import com.squareup.moshi.Json

data class SingleDeliveryChargeResponse(
    @Json(name="data")
    var data: DeliveryCharge
)
