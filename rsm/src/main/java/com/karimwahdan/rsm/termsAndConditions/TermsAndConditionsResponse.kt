package com.karimwahdan.rsm.termsAndConditions

import com.karimwahdan.rsm.termsAndConditions.TermsAndConditions
import com.squareup.moshi.Json

data class TermsAndConditionsResponse(
    @Json(name="data")
    var data:List<TermsAndConditions>?
)
