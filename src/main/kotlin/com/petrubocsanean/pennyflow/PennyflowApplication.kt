package com.petrubocsanean.pennyflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PennyflowApplication

fun main(args: Array<String>) {
	runApplication<PennyflowApplication>(*args)
}
