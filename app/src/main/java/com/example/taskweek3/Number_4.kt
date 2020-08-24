package com.example.taskweek3

private fun age(yearOfBirth: Int): String {
    val thisYear = 2020

    return if (yearOfBirth <= thisYear) "Umur anda saat ini ${thisYear-yearOfBirth} tahun" else "Manusia dari masa depan bro? :)"

}

private fun main() {
    print("Masukkan Tahun Kelahiran anda : ")
    val birth = readLine()!!.toInt()

    val result = age(birth)
    print(result)
}