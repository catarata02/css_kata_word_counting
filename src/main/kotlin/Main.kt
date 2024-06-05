package org.example

import java.io.File

fun main(args: Array<String>) {
    val wordCounter = WordCounter()
    val result: WordCountResult
    if (args.isEmpty()) {
        print("Enter text: ")
        val text = readln()
        result = wordCounter.countWordsFromString(text)
    } else {
        result = wordCounter.countWordsFromFile(File(args[0].trim()))
    }
    print("Number of words: ${result.words}, unique: ${result.uniqueWords}, average word length: ${result.averageWordLength}")
    println()
}