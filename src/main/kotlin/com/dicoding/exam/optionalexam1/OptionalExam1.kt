package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    return numbers.sorted().takeLast(3).sum()
}
