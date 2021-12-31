package hse_github_research.models.github.limit

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Plan(
    @SerialName("collaborators") val collaborators: Int?,
    @SerialName("name") val name: String?,
    @SerialName("private_repos") val privateRepos: Int?,
    @SerialName("space") val space: Int?
)
