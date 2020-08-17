package readJsonAndSplit


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SuperHero(
    @SerialName("appearance")
    val appearance: Appearance,
    @SerialName("biography")
    val biography: Biography,
    @SerialName("connections")
    val connections: Connections,
    @SerialName("id")
    val id: Int,
    @SerialName("images")
    val images: Images,
    @SerialName("name")
    val name: String,
    @SerialName("powerstats")
    val powerstats: Powerstats,
    @SerialName("slug")
    val slug: String,
    @SerialName("work")
    val work: Work
)

@Serializable
data class Appearance(
    @SerialName("eyeColor")
    val eyeColor: String,
    @SerialName("gender")
    val gender: String,
    @SerialName("hairColor")
    val hairColor: String,
    @SerialName("height")
    val height: List<String>,
    @SerialName("race")
    val race: String?,
    @SerialName("weight")
    val weight: List<String>
)

@Serializable
data class Biography(
    @SerialName("aliases")
    val aliases: List<String>,
    @SerialName("alignment")
    val alignment: String,
    @SerialName("alterEgos")
    val alterEgos: String,
    @SerialName("firstAppearance")
    val firstAppearance: String,
    @SerialName("fullName")
    val fullName: String,
    @SerialName("placeOfBirth")
    val placeOfBirth: String,
    @SerialName("publisher")
    val publisher: String?
)

@Serializable
data class Connections(
    @SerialName("groupAffiliation")
    val groupAffiliation: String,
    @SerialName("relatives")
    val relatives: String
)

@Serializable
data class Images(
    @SerialName("lg")
    val lg: String,
    @SerialName("md")
    val md: String,
    @SerialName("sm")
    val sm: String,
    @SerialName("xs")
    val xs: String
)

@Serializable
data class Powerstats(
    @SerialName("combat")
    val combat: Int,
    @SerialName("durability")
    val durability: Int,
    @SerialName("intelligence")
    val intelligence: Int,
    @SerialName("power")
    val power: Int,
    @SerialName("speed")
    val speed: Int,
    @SerialName("strength")
    val strength: Int
)

@Serializable
data class Work(
    @SerialName("base")
    val base: String,
    @SerialName("occupation")
    val occupation: String
)