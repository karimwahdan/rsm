package com.karimwahdan.rsm.owner

import com.karimwahdan.rsm.ownerStatus.OwnerStatus
import com.squareup.moshi.Json

data class Owner(
    @Json(name="id")
    var id:Int,

    @Json(name="username")
    var username:String,

    @Json(name="email")
    var email:String,

    @Json(name="main_mobile_no")
    var main_mobile_no:String,

    @Json(name = "account_status_id")
    var account_status_id:Int,

    @Json(name="un_hash_password")
    var password:String,

    @Json(name = "status")
    var status: OwnerStatus?
)
