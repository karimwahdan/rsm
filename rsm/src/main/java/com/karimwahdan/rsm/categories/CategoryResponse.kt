package com.karimwahdan.rsm.categories

import com.squareup.moshi.Json

data class CategoryResponse(
    @Json(name="data")
    var data:List<Category>?
)
