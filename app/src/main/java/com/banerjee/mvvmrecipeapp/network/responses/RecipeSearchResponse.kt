package com.banerjee.mvvmrecipeapp.network.responses

import com.banerjee.mvvmrecipeapp.network.model.RecipeDTO
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeDTO>,
)