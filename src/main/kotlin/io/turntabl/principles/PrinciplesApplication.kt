package io.turntabl.principles

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrinciplesApplication

fun main(args: Array<String>) {
	runApplication<PrinciplesApplication>(*args)
}
