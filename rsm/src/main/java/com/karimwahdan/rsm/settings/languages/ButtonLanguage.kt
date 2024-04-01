package com.karimwahdan.rsm.settings.languages

import com.squareup.moshi.Json

data class ButtonLanguage(
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
    @Json(name="add_to_cart_button_text")
    var addToCartButtonText:String,

    //5
    @Json(name = "go_to_cart_button_text")
    var goToCartButtonText:String,

    //6
    @Json(name = "clear_button_text")
    var clearButtonText:String,

    //7
    @Json(name = "continue_button_text")
    var continueButtonText:String,

    //8
    @Json(name = "delete_button_text")
    var deleteButtonText:String,

    //9
    @Json(name = "change_button_text")
    var changeButtonText:String,

    //10
    @Json(name = "proceed_button_text")
    var proceedButtonText:String,

    //11
    @Json(name = "save_for_later_button_text")
    var saveForLaterButtonText:String,

    //12
    @Json(name = "pickup_from_store_button_text")
    var pickupFromStoreButtonText:String,

    //13
    @Json(name = "doorstep_delivery_button_text")
    var doorStepDeliveryButtonText:String,

    //14
    @Json(name = "cancel_button_text")
    var cancelButtonText:String,

    //15
    @Json(name = "confirm_button_text")
    var confirmButtonText:String,

    //15
    @Json(name = "register_button_text")
    var registerButtonText:String,

    //15
    @Json(name = "signup_button_text")
    var signupButtonText:String,

    //15
    @Json(name = "login_button_text")
    var loginText:String,

    @Json(name = "home_button_text")
    var homeButtonText:String,

    @Json(name = "categories_button_text")
    var categoriesButtonText:String,

    @Json(name = "wishlist_button_text")
    var wishlistButtonText:String,

    @Json(name = "account_button_text")
    var accountButtonText:String,

    @Json(name = "shop_now")
    var shopNow:String,

    )
