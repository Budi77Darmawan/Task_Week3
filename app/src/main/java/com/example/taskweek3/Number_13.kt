package com.example.taskweek3

private fun divideSort(number: Long): String {
    val divNumber = number.toString().split("0")
    var sortNumber = ""

//    for (i in divNumber.indices) {
//        val arr = divNumber[i].toCharArray().sorted().joinToString("")
//        sortNumber += arr
//    }

    var i = 0
    while (i <= divNumber.size-1) {
        val arr = divNumber[i].toCharArray().sorted().joinToString("")
        sortNumber += arr
        i++
    }
    return sortNumber
}

private fun main(){
    print("Masukkan Deret angka : ")
    val deret = readLine()!!.toLong()

//    println(Long.MAX_VALUE)
//    Output: 9223372036854775807
    val result = divideSort(deret)
    print(result)
}