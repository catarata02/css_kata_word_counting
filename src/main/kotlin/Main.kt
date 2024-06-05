package org.example

fun main() {
    print("Enter text: ")
    val text = readln()
    val count = WordCounter().countWords(text)
    print("Number of words: $count")
    println()
}