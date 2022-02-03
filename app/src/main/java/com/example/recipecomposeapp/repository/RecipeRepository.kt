package com.example.recipecomposeapp.repository

import com.example.recipecomposeapp.domain.model.Recipe
import com.example.recipecomposeapp.network.RecipeService
import com.example.recipecomposeapp.network.model.RecipeDtoMapper

interface RecipeRepository {

    suspend fun search(token: String, page: Int, query: String): List<Recipe>

    suspend fun get(token: String, id: Int): Recipe
}