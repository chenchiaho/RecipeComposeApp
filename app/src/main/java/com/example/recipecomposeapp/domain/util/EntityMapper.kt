package com.example.recipecomposeapp.domain.util

import com.example.recipecomposeapp.domain.model.Recipe

interface EntityMapper <Entity, DomainModel> {

    fun mapFromEntity(entity: Entity) : DomainModel
    fun mapToEntity(domainModel: DomainModel): Entity
}