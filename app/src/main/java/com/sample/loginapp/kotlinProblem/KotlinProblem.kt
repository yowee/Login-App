package com.sample.loginapp.kotlinProblem

fun main() {
    val banks = mapOf(
        1121 to "ACME",
        1111 to "ALFA",
        3796 to "AMEX"
    )

    println("Please Enter Credit Card number")
    val cNumber = readLine()

    println("Please Enter Expiry Date (mm/yy)")
    val exD = readLine()

    val isValidCard = cNumber?.let {
        it.length == 16 && banks.containsKey(it.substring(0, 4)?.toInt()) && exD == it.substring(12)
    } ?: false

    println(isValidCard)
}
