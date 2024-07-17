package io.project.stalk.multi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val service: TestService,
) {
    @GetMapping("/test")
    fun test(): String = service.testing()
}
