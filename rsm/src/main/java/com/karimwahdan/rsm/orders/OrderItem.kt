package com.karimwahdan.rsm.orders

import com.karimwahdan.rsm.orders.Order
import com.karimwahdan.rsm.product.Product
import com.karimwahdan.rsm.productCustom.ProductCustom
import com.squareup.moshi.Json

data class OrderItem(
    @Json(name = "id")
    var id: Int?,

    @Json(name = "project_id")
    var project_id: Int?,

    @Json(name = "order_id")
    var order_id: Int?,

    @Json(name = "product_id")
    var product_id: Int?,

    @Json(name = "custom_id")
    var custom_id: Int?,

    @Json(name = "expiry_date")
    var expiry_date: String?,

    @Json(name = "quantity")
    var quantity: Int? = 0,

    @Json(name = "price")
    var price: Float? = 0f,

    @Json(name = "order")
    var order: Order?,

    @Json(name = "product")
    var product: Product?,

    @Json(name = "productCustom")
    var customized: ProductCustom?,



    )
