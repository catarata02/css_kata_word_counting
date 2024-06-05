package org.example

fun main() {
    print("Enter text: ")
    val text = readln()
    val count = WordCounter().countWordsFromString(text)
    print("Number of words: $count")
    println()
}