package com.karimwahdan.rsm.cart

import com.karimwahdan.rsm.product.Product
import com.karimwahdan.rsm.productCustom.ProductCustom
import com.squareup.moshi.Json


data class CartItem(
    @Json(name = "id")
    var id:Int?,

    @Json(name = "cart_id")
    var cart_id:Int?,

    @Json(name = "product_id")
    var product_id:Int?,

    @Json(name = "custom_id")
    var custom_id:Int?,

    @Json(name = "product_count")
    var quantity:Int?=0,

    @Json(name = "cart")
    var cart: Cart?,

    @Json(name = "product")
    var product: Product?,
    @Json(name = "custom")
    var productCustom: ProductCustom?
)
