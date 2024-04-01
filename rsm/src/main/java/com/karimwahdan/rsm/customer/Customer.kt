package com.karimwahdan.rsm.customer

import com.karimwahdan.rsm.basics.Country
import com.squareup.moshi.Json

data class Customer(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,

    @Json(name="first_name")
    var first_name:String,

    @Json(name="middle_name")
    var middle_name:String,

    @Json(name="last_name")
    var last_name:String,

    @Json(name="username")
    var username:String,

    @Json(name="email")
    var email:String,

    @Json(name="avatar")
    var avatar:String?,

    @Json(name="main_mobile")
    var main_mobile:String,

    @Json(name="main_address")
    var main_address:String?,

    @Json(name="country_id")
    var country_id:Int,

    @Json(name="customer_status_id")
    var customer_status_id:Int,

    @Json(name="status")
    var status: CustomerStatus,

    @Json(name = "country")
    var country: Country
)
