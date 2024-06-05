package org.example

class WordCounter {
    fun countWords(text: String): Int {
        if (text.isBlank()) {
            return 0
        }
        val tokens = text.split(" ")
        return tokens.count()
    }
}
