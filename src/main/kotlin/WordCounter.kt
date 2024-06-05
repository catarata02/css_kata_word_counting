package org.example

class WordCounter(
    stopwordsResource : String = "/stopwords.txt"
) {

    private val stopwords: List<String> = parseStopWords(stopwordsResource)


    fun countWords(text: String): Int {
        if (text.isBlank()) {
            return 0
        }
        val tokens = tokenizeWords(text)
        val tokensWithoutStopWords = filterOutStopWords(tokens)
        return tokensWithoutStopWords.count()
    }

    private fun tokenizeWords(text: String) = text.split(" ")

    private fun filterOutStopWords(tokens: List<String>) = tokens.filter { !stopwords.contains(it) }

}
