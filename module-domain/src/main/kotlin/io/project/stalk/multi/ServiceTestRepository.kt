package io.project.stalk.multi

interface ServiceTestRepository {
    fun testing(): String

    fun testing(
        id: Long,
        name: String,
    ): Long?
}
