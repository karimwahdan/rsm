package com.karimwahdan.rsm.customer

import com.squareup.moshi.Json

data class CustomerStatus(
    @Json(name="id")
    var id:Int,
    @Json(name="name")
    var name:String,
)
