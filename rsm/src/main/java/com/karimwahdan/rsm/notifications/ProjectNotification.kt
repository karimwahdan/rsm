package com.karimwahdan.rsm.notifications

import com.karimwahdan.rsm.cart.Cart
import com.karimwahdan.rsm.categories.Category
import com.karimwahdan.rsm.customer.Customer
import com.karimwahdan.rsm.orders.Order
import com.karimwahdan.rsm.product.Product
import com.karimwahdan.rsm.subCategories.SubCategory
import com.squareup.moshi.Json

data class ProjectNotification(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int?,

    @Json(name="channel_id")
    var channel_id:Int?,

    @Json(name = "channel")
    var channel: NotificationChannel?,

    @Json(name="event_id")
    var event_id:Int?,

    @Json(name = "event")
    var event: NotificationEvent?,

    @Json(name="group_id")
    var group_id:Int?,

    @Json(name="customer_id")
    var customer_id:Int?,

    @Json(name = "customer")
    var customer: Customer?,

    @Json(name="category_id")
    var category_id:Int?,

    @Json(name = "category")
    var category: Category?,

    @Json(name="sub_category_id")
    var sub_category_id:Int?,

    @Json(name = "subCategory")
    var subCategory: SubCategory?,

    @Json(name="product_id")
    var product_id:Int?,

    @Json(name = "product")
    var product: Product?,

    @Json(name="order_id")
    var order_id:Int?,

    @Json(name = "order")
    var order: Order?,

    @Json(name="cart_id")
    var cart_id:Int?,

    @Json(name = "cart")
    var cart: Cart?,

    @Json(name="is_private")
    var is_private:Int?,

    @Json(name="title")
    var title:String?,

    @Json(name="message")
    var message:String?,

    @Json(name="created_at")
    var created_at:String?,
)
