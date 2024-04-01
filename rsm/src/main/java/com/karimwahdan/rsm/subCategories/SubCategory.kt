package com.karimwahdan.rsm.subCategories

import com.karimwahdan.rsm.categories.Category
import com.karimwahdan.rsm.featuredSections.FeaturedSection
import com.karimwahdan.rsm.product.Product
import com.squareup.moshi.Json

data class SubCategory(
    @Json(name="id")
    var id:Int?,
    @Json(name="project_id")
    var project_id:Int?,
    @Json(name="category_id")
    var category_id:Int,
    @Json(name="name")
    var name:String?,
    @Json(name="description")
    var description:String?,
    @Json(name="image")
    var image:String?,
    @Json(name="category")
    var category: Category,
    @Json(name="products")
    var products:List<Product>?,
    @Json(name="sections")
    var sections:List<FeaturedSection>?
)
