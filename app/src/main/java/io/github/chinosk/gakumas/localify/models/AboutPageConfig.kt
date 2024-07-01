package io.github.chinosk.gakumas.localify.models

import kotlinx.serialization.Serializable

@Serializable
data class AboutPageConfig(
    val plugin_repo: String = "https://github.com/NatsumeLS/Gakumas-Localify-EN",
    val discord: String = "https://natsume.io/GakumasLocalize",
    val main_contributors: List<MainContributors> = listOf(),
    val contrib_img: ContribImg = ContribImg(
        "https://contrib.rocks/image?repo=NatsumeLS/Gakumas-Localify-EN",
        "https://contrib.rocks/image?repo=NatsumeLS/Gakumas-Translation-Data-EN"
    )
)

@Serializable
data class MainContributors(
    val name: String,
    val links: List<Links>
)

@Serializable
data class ContribImg(
    val plugin: String,
    val translation: String
)

@Serializable
data class Links(
    val name: String,
    val link: String
)
