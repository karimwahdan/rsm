package com.karimwahdan.rsm.customer

import com.squareup.moshi.Json

data class DeliveryAddress(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="customer_id")
    var customer_id:Int,
    @Json(name="name")
    var name:String,
    @Json(name="mobile_no")
    var mobile_no:String,
    @Json(name="alt_mobile_no")
    var alt_mobile_no:String?,
    @Json(name="address")
    var address:String,
    @Json(name="landmark")
    var landmark:String,
    @Json(name="country_id")
    var country_id:Int,
    @Json(name="city_id")
    var city_id:Int,
    @Json(name="city_name")
    var city_name:String,
    @Json(name="area_name")
    var area_name:String,
    @Json(name="state_name")
    var state_name:String?,
    @Json(name="country_name")
    var country_name:String,
    @Json(name="type")
    var address_type:String,
    @Json(name="default")
    var default_address:Boolean,
    @Json(name="longitude")
    var longitude:Float?,
    @Json(name="latitude")
    var latitude:Float?
)
