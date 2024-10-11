package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    var result = ""
    val separatedString = Regex("""\d+|\D+""").findAll(str).map { it.groupValues.first() }.toList()
    if (separatedString.count() > 1) {
        val text = separatedString.first()
        val number = separatedString.last().toInt()
        val math = number * int
        result = text + math.toString()
    } else {
        result = separatedString.first() + int.toString()
    }
    return result
}
