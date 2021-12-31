package hse_github_research.models.github.limit

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CodeScanningUpload(
    @SerialName("limit") val limit: Int,
    @SerialName("remaining") val remaining: Int,
    @SerialName("reset") val reset: Int,
    @SerialName("used") val used: Int
)
