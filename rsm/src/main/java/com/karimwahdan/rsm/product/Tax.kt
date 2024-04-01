package com.karimwahdan.rsm.product

import com.squareup.moshi.Json

data class Tax(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="name")
    var name:String,
    @Json(name="percent")
    var percent:Float,

    
)
