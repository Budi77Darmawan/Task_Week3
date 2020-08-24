package com.example.taskweek3

private fun main() {
    var x = 10
    var y = 20

    x += y
    y = x - y
    x -= y

    println("x = $x")
    println("y = $y")

//    Variable Exchange using method kotlin
//    x = y.also { y = x }
//    println("Nilai x = $x")
//    println("Nilai y = $y")

}