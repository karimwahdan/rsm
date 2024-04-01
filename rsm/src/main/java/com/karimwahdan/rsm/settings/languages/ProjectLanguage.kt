package com.karimwahdan.rsm.settings.languages

import com.squareup.moshi.Json

data class ProjectLanguage(

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
    @Json(name = "app_name")
    var appName:String,

    @Json(name = "forgot_your_password_text")
    var forgotYourPasswordText:String,

    //4
    @Json(name = "top_bar_welcome_text")
    var topBarWelcome:String,

    //5
    @Json(name="search_product_placeholder")
    var searchProductPlaceholder:String,

    //6
    @Json(name = "shop_by_category_text")
    var shopByCategory:String,

    //7
    @Json(name = "view_all_text")
    var viewAll:String,

    //8
    @Json(name = "wishlist_text")
    var wishlistText:String,

    //9
    @Json(name = "share_text")
    var shareText:String,

    //10
    @Json(name = "similar_products_text")
    var similarProductsText:String,

    //11
    @Json(name = "quantity_text")
    var quantityText:String,

    //12
    @Json(name = "shipping_details_text")
    var shippingDetailsText:String,

    //13
    @Json(name = "order_summary_text")
    var orderSummaryText:String,

    //14
    @Json(name = "unit_price_text")
    var unitPriceText:String,

    //15
    @Json(name = "total_text")
    var totalText:String,

    //16
    @Json(name = "sub_total_text")
    var subTotalText:String,

    //17
    @Json(name = "delivery_charge_text")
    var deliveryChargeText:String,

    //18
    @Json(name = "tax_text")
    var taxText:String,

    //19
    @Json(name = "you_saved_text")
    var youSavedText:String,

    //20
    @Json(name = "grand_total_text")
    var grandTotalText:String,

    //21
    @Json(name = "items_total_value_text")
    var itemsTotalValueText:String,

    //22
    @Json(name = "confirm_order_text")
    var confirmOrderText:String,

    @Json(name = "about_this_item_text")
    var aboutThisItemText:String,

    @Json(name = "default_text")
    var defaultText:String,

    @Json(name = "address_details_text")
    var addressDetailsText:String,


    @Json(name = "welcome_to_text")
    var welcomeToText:String,

    @Json(name = "all_products")
    var allProducts:String,

    @Json(name = "all_products_content")
    var allProductsContent:String,

    @Json(name = "please_login_first")
    var loginFirst:String,

    @Json(name = "address_type_home")
    var addressTypeHome:String,
    @Json(name = "address_type_office")
    var addressTypeOffice:String,
    @Json(name = "address_type_other")
    var addressTypeOther:String,
    )

