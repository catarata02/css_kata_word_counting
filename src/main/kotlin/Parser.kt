package org.example

import java.io.File

fun parseStopWords(stopwordsResource: String): List<String> {
    return getResourceAsText(stopwordsResource)
        ?.split("\n")
        ?: emptyList()
}

fun readFileContent(file: File): String {
    return file.readLines().joinToString(" ")
}

fun getResourceAsText(path: String): String? =
    object {}.javaClass.getResource(path)?.readText()