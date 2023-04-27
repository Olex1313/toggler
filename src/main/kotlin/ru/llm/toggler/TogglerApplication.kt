package ru.llm.toggler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TogglerApplication

fun main(args: Array<String>) {
	runApplication<TogglerApplication>(*args)
}
