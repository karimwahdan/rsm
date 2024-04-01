package com.karimwahdan.rsm.owner

import com.karimwahdan.rsm.owner.Owner
import com.squareup.moshi.Json

data class OwnerResponse(
    @Json(name="data")
    var data: Owner?
)
