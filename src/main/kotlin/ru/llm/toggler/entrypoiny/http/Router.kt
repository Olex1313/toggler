package ru.llm.toggler.entrypoiny.http

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.*
import ru.llm.toggler.usecase.CreateFeatureToggle
import ru.llm.toggler.usecase.FindAllFeatureToggles

@Configuration
class Router(
    private val createFeatureToggle: CreateFeatureToggle,
    private val getAllFeatureToggles: FindAllFeatureToggles
) {

    @Bean
    fun httpEndpoints(): RouterFunction<ServerResponse> =
        coRouter {
            accept(MediaType.APPLICATION_JSON).nest {
                GET("/api/toggle").invoke { req ->
                    ServerResponse.ok()
                        .bodyAndAwait(getAllFeatureToggles.execute())
                }
                POST("/api/toggle").invoke { req ->
                    ServerResponse
                        .ok()
                        .bodyValueAndAwait(createFeatureToggle.execute(req.awaitBody()))
                }
            }
        }

}