package com.example.taskweek3

private fun leapYear(year: Int): String {
    return when {
        year%400 == 0 -> "merupakan tahun kabisat"
        year%100 == 0 -> "bukan tahun kabisat"
        year%4 == 0 -> "merupakan Tahun kabisat"
        else -> "bukan tahun kabisat"
    }
}

private fun main() {
    print("Masukkan tahun : ")
    val tahun = readLine()!!.toInt()

    val result = leapYear(tahun)
    println("Tahun $tahun $result ")
}