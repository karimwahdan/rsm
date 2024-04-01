package com.karimwahdan.rsm.ownerStatus

import com.squareup.moshi.Json

data class OwnerStatus(
    @Json(name="id")
    var id:Int,
    @Json(name="name")
    var name:String
)
