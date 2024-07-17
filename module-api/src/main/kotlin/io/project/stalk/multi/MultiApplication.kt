package io.project.stalk.multi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ["io.project.stalk"])
@SpringBootApplication
class MultiApplication

fun main(args: Array<String>) {
    runApplication<MultiApplication>(*args)
}
