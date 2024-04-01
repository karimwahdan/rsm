package com.karimwahdan.rsm.basics

import com.squareup.moshi.Json

data class CountryResponse(
    @Json(name = "data")
    var data:List<Country>
)
