package ru.llm.toggler.usecase

import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.stereotype.Service
import ru.llm.toggler.entity.FeatureToggle
import ru.llm.toggler.repository.FeatureToggleRepository
import ru.llm.toggler.request.FeatureToggleCreateRequest

@Service
class CreateFeatureToggle(
    private val featureToggleRepository: FeatureToggleRepository
) {

    suspend fun execute(request: FeatureToggleCreateRequest) =
        featureToggleRepository.save(FeatureToggle.from(request)).awaitSingle()

}