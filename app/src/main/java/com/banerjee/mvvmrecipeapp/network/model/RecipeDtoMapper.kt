package com.banerjee.mvvmrecipeapp.network.model

import com.banerjee.mvvmrecipeapp.domain.model.Recipe
import com.banerjee.mvvmrecipeapp.domain.util.DomainMapper


class RecipeDtoMapper: DomainMapper<RecipeDTO, Recipe> {
    override fun mapToDomainModel(model: RecipeDTO): Recipe {
        return Recipe(
            id = model.pk,
            title = model.title,
            featuredImage = model.featuredImage,
            rating = model.rating,
            publisher = model.publisher,
            cookingInstructions = model.cookingInstructions,
            ingredients = model.ingredients?: listOf(),
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated
        )
    }

    override fun mapFromDomainModel(domainModel: Recipe): RecipeDTO {
        return RecipeDTO(
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

    fun toDomainList(initial: List<RecipeDTO>): List<Recipe>{
        return initial.map {
            mapToDomainModel(it)
        }
    }

    fun fromDomainList(initial: List<Recipe>): List<RecipeDTO>{
        return initial.map {
            mapFromDomainModel(it)
        }
    }
}