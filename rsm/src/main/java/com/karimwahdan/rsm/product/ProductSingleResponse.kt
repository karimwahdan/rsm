package com.karimwahdan.rsm.product

import com.squareup.moshi.Json

data class ProductSingleResponse(
    @Json(name="data")
    var data: Product,
    @Json(name="similar")
    var similar:List<Product>?
)
