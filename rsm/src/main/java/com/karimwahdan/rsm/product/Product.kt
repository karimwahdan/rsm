package com.karimwahdan.rsm.product

import com.karimwahdan.rsm.Unit
import com.karimwahdan.rsm.productCustom.ProductCustom
import com.karimwahdan.rsm.subCategories.SubCategory
import com.squareup.moshi.Json

data class Product(
    @Json(name = "id")
    var id: Int,
    @Json(name = "project_id")
    var project_id: Int?,
    @Json(name = "sub_category_id")
    var sub_category_id: Int?,
    @Json(name = "tax_id")
    var tax_id: Int?,
    @Json(name = "local_code")
    var local_code: String?,
    @Json(name = "bar_code")
    var bar_code: String?,
    @Json(name = "qr_code")
    var qr_code: String?,
    @Json(name = "name")
    var name: String?,
    @Json(name = "unit_id")
    var unit_id: Int?,
    @Json(name = "image")
    var image: String?,
    @Json(name = "description")
    var description: String?,
    @Json(name = "price")
    var price: Float? = 0f,
    @Json(name = "discount_price")
    var discount_price: Float? = 0f,
    @Json(name = "can_return_within")
    var can_return_within: Int? = 0,
    @Json(name = "has_expiry")
    var has_expiry: Int? = 0,
    @Json(name = "max_installments")
    var max_installments: Int? = 0,
    @Json(name = "unit")
    var unit: Unit?,
    @Json(name = "images")
    var images: List<ProductImage>?,
    @Json(name = "sub_category")
    var subCategory: SubCategory?,
    @Json(name = "tax")
    var tax: Tax?,
    @Json(name = "customs")
    var customs: List<ProductCustom>?
)
