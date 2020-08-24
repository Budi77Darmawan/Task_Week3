package com.example.taskweek3

private fun printSegitiga(number: Int): String {
    var x = number
    var stars = ""

//    for (i in 0 until number) {
//        for (j in 1..number-i) {
//            val id = j.toString()
//            stars += id
//        }
//        stars += "\n"
//    }

    val i = 1
    while (i <= x){
        var j = 1
        while (j <= x){
            val id = j.toString()
            stars += id
            j++
        }
        stars += "\n"
        x--
    }
    return stars
}

private fun main(){
    print("Masukkan jumlah baris segitiga : ")
    val baris = readLine()!!.toInt()

    val result = printSegitiga(baris)
    print(result)
}