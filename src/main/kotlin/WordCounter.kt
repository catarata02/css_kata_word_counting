package org.example

class WordCounter(
    stopwordsResource : String = "/stopwords.txt"
) {

    private val stopwords: List<String> = parseStopWords(stopwordsResource)


    fun countWords(text: String): Int {
        if (text.isBlank()) {
            return 0
        }
        val tokens = text.split(" ")
        val tokensWithoutStopwords = tokens.filter { !stopwords.contains(it) }
        return tokensWithoutStopwords.count()
    }
}
