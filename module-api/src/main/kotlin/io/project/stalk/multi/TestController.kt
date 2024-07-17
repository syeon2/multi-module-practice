package io.project.stalk.multi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val service: TestService,
) {
    @GetMapping("/test")
    fun test(): String = service.testing()

    @PostMapping("/test/{id}/{name}")
    fun test3(
        @PathVariable id: Long,
        @PathVariable name: String,
    ): Long? = service.testing(id, name)
}
