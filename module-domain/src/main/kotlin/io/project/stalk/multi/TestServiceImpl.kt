package io.project.stalk.multi

import org.springframework.stereotype.Service

@Service
class TestServiceImpl(
    private val service: ServiceTestRepository,
) : TestService {
    override fun testing(): String = service.testing()
}
