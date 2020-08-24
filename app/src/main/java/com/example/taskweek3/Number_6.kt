package com.example.taskweek3

private fun luasLingkaran(r: Double): Double{
    val phi: Double = if (r%7 == 0.0) 22/7.0  else 3.14
    return phi*r*r
}

private fun main() {
    print("Masukkan jari-jari lingkaran : ")
    val jarijari = readLine()!!.toDouble()

    val result = luasLingkaran(jarijari)
    println("Luas lingkaran = $result")
}