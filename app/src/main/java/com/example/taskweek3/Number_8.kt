package com.example.taskweek3

private fun meanUN(mtk: Double, ipa: Double, bhsInggis: Double, bhsIndonesia: Double): Double {
    return (mtk+ipa+bhsIndonesia+bhsInggis)/4
}

private fun gradeUn(meanUN: Double): String {
    return when {
        meanUN >= 90 -> "A"
        meanUN >= 80 -> "B"
        meanUN >= 70 -> "C"
        meanUN >= 60 -> "D"
        else -> "E"
    }
}

private fun main() {
    print("Masukkan nilai UN Matematika : ")
    val nilaiMTK = readLine()!!.toDouble()
    print("Masukkan nilai UN IPA : ")
    val nilaiIPA = readLine()!!.toDouble()
    print("Masukkan nilai UN Bhs. Inggris : ")
    val nilaiBhsInggris = readLine()!!.toDouble()
    print("Masukkan nilai UN Bhs. Indonesia : ")
    val nilaiBhsIndonesia = readLine()!!.toDouble()

    if (nilaiMTK in 0.0..100.0 && nilaiIPA in 0.0..100.0 && nilaiBhsInggris in 0.0..100.0 && nilaiBhsIndonesia in 0.0..100.0) {
        val mean = meanUN(nilaiMTK, nilaiIPA, nilaiBhsInggris, nilaiBhsIndonesia)
        val grade = gradeUn(mean)
        println("\nRata-rata nilai UN = $mean ")
        println("Grade = $grade ")
    } else {
        println("Mohon diisi dengan rentang 0 - 100")
    }
}