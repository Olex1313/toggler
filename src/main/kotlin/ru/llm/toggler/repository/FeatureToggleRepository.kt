package ru.llm.toggler.repository

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import ru.llm.toggler.entity.FeatureToggle

interface FeatureToggleRepository : ReactiveMongoRepository<FeatureToggle, String> {
}