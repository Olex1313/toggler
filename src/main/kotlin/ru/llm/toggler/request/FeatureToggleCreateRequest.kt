package ru.llm.toggler.request

data class FeatureToggleCreateRequest(
    val name: String,
    val value: String
)
