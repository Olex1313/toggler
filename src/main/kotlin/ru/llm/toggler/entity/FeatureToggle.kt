package ru.llm.toggler.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ru.llm.toggler.request.FeatureToggleCreateRequest
import java.time.Instant

@Document
class FeatureToggle(
    @Id
    var name: String,
    var value: String,
    var updatedAt: Instant
) {

    companion object {
        fun from(request: FeatureToggleCreateRequest) = FeatureToggle(
            name = request.name,
            value = request.value,
            updatedAt = Instant.now()
        )
    }

}
