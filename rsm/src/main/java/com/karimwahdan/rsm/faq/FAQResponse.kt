package com.karimwahdan.rsm.faq

import com.squareup.moshi.Json

data class FAQResponse(
    @Json(name="data")
    var data:List<FAQ>?
)
