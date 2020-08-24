package com.example.taskweek3

import java.util.*

private fun detectPalindrom(word: String): String {
    val normalword = word.toLowerCase(Locale.ROOT)
    var reverseWord = ""
    var x = word.length - 1

//    reverseWord = normalword.reversed()
//    for (i in x downTo 0) {
//        reverseWord += normalword[i]
//    }

    while (x >= 0) {
        reverseWord += normalword[x]
        x--
    }
    return if (normalword == reverseWord) "palindrom" else "bukan palindrom"
}

private fun main(){
    print("Masukkan kata : ")
    val kata = readLine()!!

    val result = detectPalindrom(kata)
    print(result)
}