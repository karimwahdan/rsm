package com.karimwahdan.rsm.mixedResponses

import com.karimwahdan.rsm.product.Product
import com.karimwahdan.rsm.subCategories.SubCategory
import com.squareup.moshi.Json

data class SubCategoryAndProductResponse(
    @Json(name="sub-categories")
    var subCategories:List<SubCategory>,
    @Json(name="products")
    var products:List<Product>
)
