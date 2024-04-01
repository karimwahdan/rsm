package com.karimwahdan.rsm.basics

import com.squareup.moshi.Json

data class AreaResponse(
    @Json(name = "data")
    var data:List<Area>
)
