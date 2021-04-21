package com.banerjee.mvvmrecipeapp.repository

import com.banerjee.mvvmrecipeapp.domain.model.Recipe
import com.banerjee.mvvmrecipeapp.network.RecipeService
import com.banerjee.mvvmrecipeapp.network.model.RecipeDtoMapper

class RecipeRepository_Impl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
) : RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token, page, query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}