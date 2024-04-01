package com.karimwahdan.rsm.privacyPolicy

import com.karimwahdan.rsm.privacyPolicy.PrivacyPolicy
import com.squareup.moshi.Json

data class PrivacyPolicyResponse(
    @Json(name="data")
    var data:List<PrivacyPolicy>?
)
