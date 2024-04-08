package com.karimwahdan.rsm.settings.languages

import com.squareup.moshi.Json

data class GeneralText(
    @Json(name = "items")
    var items:String,

    @Json(name="alternative_mobile_no")
    var alternativeMobileNoString:String,

    @Json(name="address")
    var address:String,

    @Json(name="address_type")
    var address_type:String,

    @Json(name="landmark")
    var landmark:String,

    @Json(name="city")
    var city:String,

    @Json(name="area")
    var area:String,

    @Json(name="loading_city")
    var loading_city:String,

    @Json(name="error_loading_city")
    var error_loading_city:String,

    @Json(name="select")
    var select:String,

    @Json(name="street")
    var street:String,

    var orderCode:String,
    var totalItems:String,
    var orderPrice:String,
    var discountPrice:String,

    var deliveryType:String,
    var deliveryPrice:String,
    var taxPrice:String,
    var grandTotal:String,
    var canReturnWithin:String,
    var day:String,
    var selectDeliveryAddress:String,
    var noData:String,
    var paymentCannotBeCompleted:String,
    var products:String,
    var promoCode:String,
    var originalPrice:String,
    var expiryDate:String,
    var total:String,
    var expectedDeliveryDate:String,
    var from:String,
    var to:String,

    var material:String?,
    var width:String?,
    var length:String?,
    var height:String?,
    var thickness:String?,
    var color:String?,
    var weight:String?,
    var size:String?,

)
