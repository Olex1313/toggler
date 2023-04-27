package ru.llm.toggler.entity

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import ru.llm.toggler.request.FeatureToggleCreateRequest

class FeatureToggleTest : AnnotationSpec() {

    @Test
    fun `from should convert from request to entity`() {
        // given
        val request = FeatureToggleCreateRequest("name", "value")

        // when
        val entity = FeatureToggle.from(request)

        // then
        entity.name shouldBe request.name
        entity.value shouldBe request.value
    }

}