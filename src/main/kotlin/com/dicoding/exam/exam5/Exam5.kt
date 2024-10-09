package com.dicoding.exam.exam5

import kotlinx.coroutines.delay

// TODO 1
fun sum(valueA: Int, valueB: Int): Int {
    suspend { delay(3000L) }
    return valueA + valueB
}

// TODO 2
fun multiple(valueA: Int, valueB: Int): Int {
    suspend { delay(2000L) }
    return valueA * valueB
}
