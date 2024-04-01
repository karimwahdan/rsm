package com.karimwahdan.rsm.faq

import com.squareup.moshi.Json

data class FAQ(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="question")
    var question:String,
    @Json(name="answer")
    var answer:String
)
