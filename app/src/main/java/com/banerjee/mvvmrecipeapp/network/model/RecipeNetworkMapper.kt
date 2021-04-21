package com.banerjee.mvvmrecipeapp.network.model

import com.banerjee.mvvmrecipeapp.domain.model.Recipe
import com.banerjee.mvvmrecipeapp.domain.util.EntityMapper


class RecipeNetworkMapper: EntityMapper<RecipeNetworkEntity, Recipe> {
    override fun mapFromEntity(entity: RecipeNetworkEntity): Recipe {
        return Recipe(
            id = entity.pk,
            title = entity.title,
            featuredImage = entity.featuredImage,
            rating = entity.rating,
            publisher = entity.publisher,
            cookingInstructions = entity.cookingInstructions,
            ingredients = entity.ingredients?: listOf(),
            dateAdded = entity.dateAdded,
            dateUpdated = entity.dateUpdated
        )
    }

    override fun mapToEntity(domainModel: Recipe): RecipeNetworkEntity {
        return RecipeNetworkEntity(
            pk = domainModel.id,
            title = domainModel.title,
            featuredImage = domainModel.featuredImage,
            rating = domainModel.rating,
            publisher = domainModel.publisher,
            cookingInstructions = domainModel.cookingInstructions,
            ingredients = domainModel.ingredients,
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated
        )
    }

    fun fromEntityList(initial: List<RecipeNetworkEntity>): List<Recipe>{
        return initial.map {
            mapFromEntity(it)
        }
    }

    fun toEntityList(initial: List<Recipe>): List<RecipeNetworkEntity>{
        return initial.map {
            mapToEntity(it)
        }
    }
}