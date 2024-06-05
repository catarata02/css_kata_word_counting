package org.example

import java.io.File

class WordCounter(
    stopwordsResource: String = "/stopwords.txt",
) {
    private val stopwords: List<String> = parseStopWords(stopwordsResource)
    private val wordRegex = Regex("[a-zA-z]+")

    fun countWordsFromString(text: String): WordCountResult {
        val tokens = tokenizeWords(text)
        val tokensWithoutStopWords = filterOutStopWords(tokens)
        return calculateCountsForTokens(tokensWithoutStopWords)
    }

    fun countWordsFromFile(file: File): WordCountResult {
        val myString = readFileContent(file)
        return countWordsFromString(myString)
    }

    private fun tokenizeWords(text: String): List<String> {
        return wordRegex.findAll(text)
            .map { it.value }
            .toList()
    }

    private fun filterOutStopWords(tokens: List<String>) = tokens.filter { !stopwords.contains(it) }

    private fun calculateCountsForTokens(tokensWithoutStopWords: List<String>) =
        WordCountResult(words = tokensWithoutStopWords.count(), uniqueWords = tokensWithoutStopWords.toSet().count())

}

data class WordCountResult(val words: Int, val uniqueWords: Int)