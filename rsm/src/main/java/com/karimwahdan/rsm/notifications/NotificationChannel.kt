package com.karimwahdan.rsm.notifications

import com.squareup.moshi.Json

data class NotificationChannel(
    @Json(name="id")
    var id:Int,

    @Json(name="ar_name")
    var ar_name:String,

    @Json(name="en_name")
    var en_name:String,
)
