package org.example

fun parseStopWords(stopwordsResource: String): List<String> {
    return getResourceAsText(stopwordsResource)
        ?.split("\n")
        ?: emptyList()
}

fun getResourceAsText(path: String): String? =
    object {}.javaClass.getResource(path)?.readText()