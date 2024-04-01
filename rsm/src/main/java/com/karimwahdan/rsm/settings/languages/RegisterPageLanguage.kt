package com.karimwahdan.rsm.settings.languages

import com.squareup.moshi.Json

data class RegisterPageLanguage(
    //1
    @Json(name = "id")
    var id:Int,

    //2
    @Json(name="project_id")
    var project_id:Int,

    //3
    @Json(name = "language")
    var language:String,

    @Json(name = "un_email_mob_text")
    var usernameEmailMobileText:String,

    @Json(name="name_text")
    var nameText:String,
    //4
    @Json(name="first_name_text")
    var firstNameText:String,

    //5
    @Json(name = "middle_name_text")
    var middleNameText:String,

    //6
    @Json(name = "last_name_text")
    var lastNameText:String,

    //7
    @Json(name = "email_text")
    var emailText:String,

    //8
    @Json(name = "username_text")
    var usernameText:String,

    //9
    @Json(name = "password_text")
    var passwordText:String,

    //10
    @Json(name = "password_confirmation_text")
    var passwordConfirmationText:String,

    //11
    @Json(name = "country_text")
    var countryText:String,

    //12
    @Json(name = "mobile_text")
    var mobileText:String,

    )
