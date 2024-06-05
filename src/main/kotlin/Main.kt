package org.example

import java.io.File

class RunnerArguments(val args: Array<String>) {

    private val indexArgument = "-index"
    
    fun printIndex(): Boolean {
        return args.contains(indexArgument)
    }

    fun isFile(): Boolean {
        return !args.contains(indexArgument)
    }

    fun getFile(): File? {
        TODO("Not yet implemented")
    }

}

fun main(args: Array<String>) {
    val wordCounter = WordCounter()
    val result: WordCountResult
    val runnerArguments = RunnerArguments(args)
    if (runnerArguments.isFile()) {
        print("Enter text: ")
        val text = readln()
        result = wordCounter.countWordsFromString(text)
    } else {
        result = wordCounter.countWordsFromFile(File(args[0].trim()))
    }
    print("Number of words: ${result.words}, unique: ${result.uniqueWords}, average word length: ${result.averageWordLength}")
    if (runnerArguments.printIndex()) {
        println("characters index:")
        result.wordsIndex.forEach { println(it) }
    }
    println()
}

