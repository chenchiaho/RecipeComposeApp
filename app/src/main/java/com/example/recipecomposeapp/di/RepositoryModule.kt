package com.example.recipecomposeapp.di

import com.example.recipecomposeapp.network.RecipeService
import com.example.recipecomposeapp.network.model.RecipeDtoMapper
import com.example.recipecomposeapp.repository.RecipeRepository
import com.example.recipecomposeapp.repository.RecipeRepository_Impl
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository {
        return RecipeRepository_Impl(recipeService, recipeDtoMapper)
    }


}