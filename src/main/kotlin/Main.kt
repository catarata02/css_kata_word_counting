package org.example

import java.io.File

fun main(args: Array<String>) {
    val wordCounter = WordCounter()
    val count: WordCountResult
    if (args.isEmpty()) {
        print("Enter text: ")
        val text = readln()
        count = wordCounter.countWordsFromString(text)
    } else {
        count = wordCounter.countWordsFromFile(File(args[0].trim()))
    }
    print("Number of words: ${count.words}, unique: ${count.uniqueWords}")
    println()
}