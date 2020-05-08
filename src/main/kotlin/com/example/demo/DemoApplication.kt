package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = [
	"com.example.demo.domain",
	"com.example.demo.data"
])
@EntityScan("com.example.demo.domain.entity")
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
