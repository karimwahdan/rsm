package com.karimwahdan.rsm.featuredSections

import com.karimwahdan.rsm.product.Product
import com.karimwahdan.rsm.subCategories.SubCategory
import com.squareup.moshi.Json

data class FeaturedSection(
    @Json(name="id")
    var id:Int,
    @Json(name="project_id")
    var project_id:Int,
    @Json(name="title")
    var title:String?,
    @Json(name="description")
    var description:String?,
    @Json(name="image")
    var image:String?,
    @Json(name="product_type")
    var product_type:String,
    @Json(name="arrangement")
    var arrangement:Int?,
    @Json(name="style")
    var style:String,
    @Json(name="sub_categories")
    var sub_categories:List<SubCategory>?,
    @Json(name="products")
    var products:List<Product>?
)
