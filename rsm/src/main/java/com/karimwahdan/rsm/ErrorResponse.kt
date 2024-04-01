package com.karimwahdan.rsm

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @Json(name="message")
    val message:String,
    @Json(name="errors")
    val errors: Map<String, List<String>>?
)
