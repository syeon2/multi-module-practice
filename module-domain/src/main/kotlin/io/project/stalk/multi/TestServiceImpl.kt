package io.project.stalk.multi

import org.springframework.core.env.Environment
import org.springframework.stereotype.Service

@Service
class TestServiceImpl(
    private val service: ServiceTestRepository,
    private val env: Environment,
) : TestService {
    override fun testing(): String {
        println(env.getProperty("domainTest.testing"))

        return service.testing()
    }
}
