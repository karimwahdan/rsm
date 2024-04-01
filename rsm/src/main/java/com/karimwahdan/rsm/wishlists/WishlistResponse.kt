package com.karimwahdan.rsm.wishlists

import com.karimwahdan.rsm.wishlists.WishItem
import com.squareup.moshi.Json

data class WishlistResponse(
    @Json(name="data")
    var data:MutableList<WishItem>
)
