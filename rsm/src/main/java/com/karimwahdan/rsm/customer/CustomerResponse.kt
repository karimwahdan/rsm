package com.karimwahdan.rsm.customer

import com.squareup.moshi.Json

data class CustomerResponse(
    @Json(name="data")
    var data: Customer?,
)
