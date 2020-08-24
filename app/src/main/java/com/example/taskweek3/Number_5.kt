package com.example.taskweek3

private fun luasSegitiga(alas: Double, tinggi: Double): Double{
    return (alas*tinggi)/2
}

private fun main() {
    print("Masukkan Alas Segitiga : ")
    val alasSegitiga = readLine()!!.toDouble()
    print("Masukkan Tinggi Segitiga : ")
    val tinggiSegitiga = readLine()!!.toDouble()

    val result = luasSegitiga(alasSegitiga,tinggiSegitiga)
    println("Luas segitiga = $result")
}