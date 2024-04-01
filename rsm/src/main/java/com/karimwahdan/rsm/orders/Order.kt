package com.karimwahdan.rsm.orders

import com.karimwahdan.rsm.basics.OrderStatus
import com.squareup.moshi.Json

data class Order(
    @Json(name="id")
    var id:Int?,

    @Json(name="project_id")
    var project_id:Int,

    @Json(name="customer_id")
    var customer_id:Int?,

    @Json(name="order_code")
    var order_code:String,

    @Json(name="order_status_id")
    var order_status_id:Int,

    @Json(name="promo_code")
    var promo_code:String?,

    @Json(name="tax_value")
    var tax_value:Float?,

    @Json(name="service_value")
    var service_value:Float?,

    @Json(name="promo_code_discount_value")
    var promo_code_discount_value:Float?,

    @Json(name="total_value")
    var total_value:Float,

    @Json(name="status")
    var status: OrderStatus?,

    @Json(name="delivery_type")
    var delivery_type:String?,

    @Json(name="items")
    var items:MutableList<OrderItem>?,

    @Json(name="expected_delivery_date_from")
    var expectedDeliveryDate_from:String?,
    @Json(name="expected_delivery_date_to")
    var expectedDeliveryDate_to:String?,
)
