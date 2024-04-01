package com.karimwahdan.rsm.notifications

import com.squareup.moshi.Json

data class ProjectNotificationResponse(
    @Json(name="data")
    var data:List<ProjectNotification>?
)
