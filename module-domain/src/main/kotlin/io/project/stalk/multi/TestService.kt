package io.project.stalk.multi

interface TestService {
    fun testing(): String

    fun testing(
        id: Long,
        name: String,
    ): Long?
}
