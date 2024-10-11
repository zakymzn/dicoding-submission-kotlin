package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val stringNumber = number.toString()
    val numberList = stringNumber.toList()
    val sortedNumber = numberList.sorted()
    var result = 0
    if (stringNumber.length in 2..9) {
        result = sortedNumber.first().digitToInt() + sortedNumber.last().digitToInt()
    }
    return result
}
