package ru.llm.toggler.usecase

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.reactive.asFlow
import org.springframework.stereotype.Service
import ru.llm.toggler.entity.FeatureToggle
import ru.llm.toggler.repository.FeatureToggleRepository

@Service
class FindAllFeatureToggles(
    private val featureToggleRepository: FeatureToggleRepository
) {
    suspend fun execute(): Flow<FeatureToggle> = featureToggleRepository.findAll().asFlow()
}
