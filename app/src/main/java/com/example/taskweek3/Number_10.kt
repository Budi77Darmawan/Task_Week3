package com.example.taskweek3

private fun sortWords(name: String): String {
    var vokal = ""
    var konstanta = ""
//    for (i in name.indices) {
////        if (name[i] == 'a' || name[i] == 'A' || name[i] == 'e' || name[i] == 'E' || name[i] == 'i' || name[i] == 'I' || name[i] == 'o' || name[i] == 'O' || name[i] == 'u' || name[i] == 'U') {
////            vokal += name[i]
////        } else {
////            konstanta += name[i]
////        }
////    }

    val x = name.length - 1
    var y = 0
    while (y <= x) {
        if (name[y] == 'a' || name[y] == 'A' || name[y] == 'e' || name[y] == 'E' || name[y] == 'i' || name[y] == 'I' || name[y] == 'o' || name[y] == 'O' || name[y] == 'u' || name[y] == 'U') {
            vokal += name[y]
        } else {
            konstanta += name[y]
        }
        y++
    }
    val word1 = vokal.toCharArray().sorted().joinToString("")
    val word2 = konstanta.toCharArray().sorted().joinToString("")
    return vokal + konstanta
}

private fun main(){
    print("Masukkan kata : ")
    val kata = readLine()!!

    val result = sortWords(kata)
    print(result)
}