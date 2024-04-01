package com.karimwahdan.rsm.home

import com.karimwahdan.rsm.advertisements.Advertisement
import com.karimwahdan.rsm.basics.UpdateItem
import com.karimwahdan.rsm.categories.Category
import com.karimwahdan.rsm.designs.bars.BottomBarSettings
import com.karimwahdan.rsm.designs.bars.TopBarSettings
import com.karimwahdan.rsm.designs.buttons.AddtoCartButtonSettings
import com.karimwahdan.rsm.designs.buttons.IncrementButtonSettings
import com.karimwahdan.rsm.designs.buttons.OtherButtonSettings
import com.karimwahdan.rsm.designs.cards.AddressCardSettings
import com.karimwahdan.rsm.designs.cards.CartCardSettings
import com.karimwahdan.rsm.designs.cards.FaqCardSettings
import com.karimwahdan.rsm.designs.cards.HorizontalProductCardSettings
import com.karimwahdan.rsm.designs.cards.IconCardSettings
import com.karimwahdan.rsm.designs.cards.NormalProductCardSettings
import com.karimwahdan.rsm.designs.cards.OrderCardSettings
import com.karimwahdan.rsm.designs.cards.OrderItemCardSettings
import com.karimwahdan.rsm.designs.featured.OneBigSetting
import com.karimwahdan.rsm.designs.screens.AboutUsScreenSettings
import com.karimwahdan.rsm.designs.screens.AddressScreenSettings
import com.karimwahdan.rsm.designs.screens.CartScreenSettings
import com.karimwahdan.rsm.designs.screens.CategoryScreenSettings
import com.karimwahdan.rsm.designs.screens.CreateAddressScreenSettings
import com.karimwahdan.rsm.designs.screens.FaqScreenSettings
import com.karimwahdan.rsm.designs.screens.HomeScreenSettings
import com.karimwahdan.rsm.designs.screens.LoginScreenSettings
import com.karimwahdan.rsm.designs.screens.NotificationScreenSettings
import com.karimwahdan.rsm.designs.screens.RegisterScreenSettings
import com.karimwahdan.rsm.designs.screens.SearchScreenSettings
import com.karimwahdan.rsm.designs.screens.SubCategoryScreenSettings
import com.karimwahdan.rsm.designs.screens.WishlistScreenSettings
import com.karimwahdan.rsm.featuredSections.FeaturedSection
import com.karimwahdan.rsm.notifications.NotificationChannel
import com.karimwahdan.rsm.notifications.NotificationEvent
import com.karimwahdan.rsm.product.Product
import com.squareup.moshi.Json

data class HomeDataModel(

    @Json(name="app_update")
    var updateItem: UpdateItem?,

    @Json(name="advertisements")
    var ads:List<Advertisement>?,
    @Json(name="categories")
    var categories:List<Category>?,
    @Json(name="sections")
    var sections:List<FeaturedSection>?,
    @Json(name="products")
    var products:List<Product>?,

    @Json(name="channels")
    var channels:List<NotificationChannel>?,

    @Json(name="events")
    var events:List<NotificationEvent>?,

    @Json(name="bottom_bar_settings")
    var bottomBarSettings: BottomBarSettings?,

    @Json(name="top_bar_settings")
    var topBarSettings: TopBarSettings?,

    @Json(name="subCategoriesScreenSettings")
    var subCategoryScreenSettings: SubCategoryScreenSettings?,

    @Json(name="categoriesScreenSettings")
    var categoriesScreenSettings: CategoryScreenSettings?,

    @Json(name="aboutUsScreenSettings")
    var aboutUsScreenSettings: AboutUsScreenSettings?,

    @Json(name = "addressScreenSettings")
    var addressScreenSettings: AddressScreenSettings?,

    @Json(name = "homeScreenSettings")
    var homeScreenSettings: HomeScreenSettings?,

    @Json(name="notificationScreenSettings")
    var notificationScreenSettings: NotificationScreenSettings?,

    @Json(name="loginScreenSettings")
    var loginScreenSettings: LoginScreenSettings?,

    @Json(name = "faqScreenSettings")
    var faqScreenSettings: FaqScreenSettings?,

    @Json(name = "registerScreenSettings")
    var registerScreenSettings: RegisterScreenSettings?,

    @Json(name = "searchScreenSettings")
    var searchScreenSettings: SearchScreenSettings?,

    @Json(name = "wishlistScreenSettings")
    var wishlistScreenSettings: WishlistScreenSettings?,

    @Json(name = "horizontalPCSettings")
    var horizontalProductCardSettings: HorizontalProductCardSettings?,

    @Json(name = "normalProductCardSettings")
    var normalProductCardSettings: NormalProductCardSettings?,

    @Json(name = "addressCardSettings")
    var addressCardSettings: AddressCardSettings?,

    @Json(name = "faqCardSettings")
    var faqCardSettings: FaqCardSettings?,

    @Json(name = "cartScreenSettings")
    var cartScreenSettings: CartScreenSettings?,

    @Json(name = "createAddressScreenSettings")
    var createAddressScreenSettings: CreateAddressScreenSettings?,

    @Json(name="icon_card_settings")
    var iconCardSettings: IconCardSettings?,

    @Json(name = "orderCardSettings")
    var orderCardSettings: OrderCardSettings?,

    @Json(name = "orderItemCardSettings")
    var orderItemCardSettings: OrderItemCardSettings?,

    @Json(name="otherButtonSettings")
    var otherButtonSettings: OtherButtonSettings?,

    @Json(name = "cartItemCardSettings")
    var cartCardSettings: CartCardSettings?,

    @Json(name="incrementButtonSettings")
    var incrementButtonSettings: IncrementButtonSettings?,

    @Json(name="addToCartButtonSettings")
    var addToCartButtonSettings: AddtoCartButtonSettings?,

    @Json(name="oneBigSettings")
    var oneBigSettings: OneBigSetting?,


    )

