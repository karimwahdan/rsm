package com.karimwahdan.rsm.project

import com.squareup.moshi.Json

data class ProjectResponse(
    @Json(name="data")
    var data: Project?
)
