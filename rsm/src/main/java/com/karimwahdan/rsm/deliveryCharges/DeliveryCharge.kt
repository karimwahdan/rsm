package com.karimwahdan.rsm.deliveryCharges

import com.squareup.moshi.Json

data class DeliveryCharge(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="city_id")
    var city_id:Int,
    @Json(name="delivery_charge")
    var delivery_charge:Float,
    @Json(name="min_free_delivery_order_value")
    var min_FreeDelivery_OrderValue:Float,

)
