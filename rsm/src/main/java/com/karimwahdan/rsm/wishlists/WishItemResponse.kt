package com.karimwahdan.rsm.wishlists

import com.squareup.moshi.Json

data class WishItemResponse(
    @Json(name="data")
    var data: WishItem?
)
