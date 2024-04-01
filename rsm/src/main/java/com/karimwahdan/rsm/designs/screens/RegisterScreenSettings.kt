package com.karimwahdan.rsm.designs.screens

import com.squareup.moshi.Json

data class RegisterScreenSettings(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,

    @Json(name="bg_1")
    var bg_1:String?,

    @Json(name="bg_2")
    var bg_2:String?,

    @Json(name="app_name_font_color")
    var app_name_font_color:String?,

    @Json(name="app_name_font_size")
    var app_name_font_size:Int?,

    @Json(name="fields_font_color")
    var fields_font_color:String?,

    @Json(name="fields_bg")
    var fields_bg:String?,

    @Json(name="login_btn_font_color")
    var login_btn_font_color:String?,

    @Json(name="login_btn_bg")
    var login_btn_bg:String?,

    @Json(name="register_btn_font_color")
    var register_btn_font_color:String?,

    @Json(name="register_btn_bg")
    var register_btn_bg:String?,
    
)
