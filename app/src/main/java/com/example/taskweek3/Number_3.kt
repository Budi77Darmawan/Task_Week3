package com.example.taskweek3

private fun oddEven(number: Int): String {
    return if (number%2 == 0) "Genap" else "Ganjil"
}

private fun main() {
    print("Masukkan angka : ")
    val x = readLine()!!.toInt()

    val result = oddEven(x)
    println("$x merupakan bilangan $result")
}