package com.karimwahdan.rsm.deliveryCharges

import com.squareup.moshi.Json

data class DeliveryChargeResponse(
    @Json(name="data")
    var data:List<DeliveryCharge>
)
