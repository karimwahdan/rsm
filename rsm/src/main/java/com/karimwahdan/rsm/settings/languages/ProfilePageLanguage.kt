package com.karimwahdan.rsm.settings.languages

import com.squareup.moshi.Json

data class ProfilePageLanguage(
    //1
    @Json(name = "id")
    var id:Int,

    //2
    @Json(name="project_id")
    var project_id:Int,

    //3
    @Json(name = "language")
    var language:String,

    //4
    @Json(name="home_text")
    var homeText:String,

    //5
    @Json(name = "my_cart_text")
    var myCartText:String,

    //6
    @Json(name = "notifications_text")
    var notificationsText:String,

    //7
    @Json(name = "my_orders_text")
    var myOrdersText:String,

    //8
    @Json(name = "my_transactions_history_text")
    var myTransactionsHistoryText:String,

    //9
    @Json(name = "change_my_password_text")
    var changeMyPasswordText:String,

    //10
    @Json(name = "manage_my_addresses_text")
    var manageMyAddressesText:String,

    //11
    @Json(name = "contact_us_text")
    var contactUsText:String,

    //12
    @Json(name = "about_us_text")
    var aboutUsText:String,

    //13
    @Json(name = "rate_us_text")
    var rateUsText:String,

    //14
    @Json(name = "share_app_text")
    var shareAppText:String,

    //15
    @Json(name = "faq_text")
    var faqText:String,

    //16
    @Json(name = "terms_text")
    var termsAndConditionsText:String,

    //17
    @Json(name = "privacy_text")
    var privacyText:String,

    //18
    @Json(name = "developers_text")
    var developersText:String,

    @Json(name = "change_language_text")
    var changeLanguageText:String,

    //18
    @Json(name = "logout_text")
    var logoutText:String,

    //18
    @Json(name = "project_logout_text")
    var projectLogoutText:String,

    )
