package com.example.taskweek3

private fun detectPalindrom(words: String): String {
    val normalword = words.split(" ")
    var reverseWords = ""
    var x = normalword.size - 1

//    for (i in x downTo 0) {
//        reverseWords += "${normalword[i]} "
//    }

    while (x >= 0) {
        reverseWords += normalword[x] + " "
        x--
    }
    return reverseWords
}

private fun main(){
    print("Masukkan kalimat : ")
    val kalimat = readLine()!!

    val result = detectPalindrom(kalimat)
    print(result)
}