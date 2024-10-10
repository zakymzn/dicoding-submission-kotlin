package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    var middleCharacter = ""
    if (string.length <= 100) {
        if (string.length % 2 == 0) {
            middleCharacter = "${string[(string.length/2) - 1]}${string[string.length/2]}"
        } else {
            middleCharacter = "${string[string.length/2]}"
        }
    }
    return middleCharacter
}