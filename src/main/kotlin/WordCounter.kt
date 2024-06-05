package org.example

import java.io.File

class WordCounter(
    stopwordsResource: String = "/stopwords.txt",
) {

    private val stopwords: List<String> = parseStopWords(stopwordsResource)


    fun countWordsFromString(text: String): Int {
        val tokens = tokenizeWords(text)
        val tokensWithoutStopWords = filterOutStopWords(tokens)
        return tokensWithoutStopWords.count()
    }

    fun countWordsFromFile(file: File): Int {
        val myString = readFileContent(file)
        return countWordsFromString(myString)
    }

    private fun tokenizeWords(text: String): List<String> {
        return text.trim()
            .split(" ")
            .filter { it.isNotBlank() }
    }

    private fun filterOutStopWords(tokens: List<String>) = tokens.filter { !stopwords.contains(it) }

}
