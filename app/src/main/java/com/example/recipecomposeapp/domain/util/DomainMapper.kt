package com.example.recipecomposeapp.domain.util

import com.example.recipecomposeapp.domain.model.Recipe

interface DomainMapper <T, DomainModel> {

    fun mapToDomainModel(model: T) : DomainModel
    fun mapFromDomainModel(domainModel: DomainModel): T
}