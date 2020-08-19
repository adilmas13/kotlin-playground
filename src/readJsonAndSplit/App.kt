package readJsonAndSplit

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

// https://github.com/Kotlin/kotlinx.serialization/blob/master/docs/basic-serialization.md#json-decoding

private const val CHUNK_SIZE = 50

fun main() {
    val folderPath = "./src/readJsonAndSplit"

    // read huge json from file
    val filePath = "${folderPath}/super-heroes.json"
    val jsonString: String = File(filePath).readText(Charsets.UTF_8)
    val list = Json.decodeFromString<List<SuperHero>>(jsonString)

    // break List to chunks based on CHUNK_SIZE
    val chunkedList = list.chunked(CHUNK_SIZE)

    // check directory
    val outputFolder = "${folderPath}/output"
    val directory = File(outputFolder)
    if (directory.exists().not()) {
        directory.mkdir()
    }
    // write to file
    chunkedList.forEachIndexed { index, chunk ->
        val outputFilePath = "${outputFolder}/super-heroes-${index + 1}.json"
        val file = File(outputFilePath)
        file.writeText(Json.encodeToString(chunk))
    }
}