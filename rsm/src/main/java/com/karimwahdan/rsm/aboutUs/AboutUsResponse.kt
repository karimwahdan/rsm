package com.karimwahdan.rsm.aboutUs

import com.squareup.moshi.Json

data class AboutUsResponse(
    @Json(name="data")
    var data:List<AboutUs>?
)
