package com.example.scancard

fun isNumberCard(text : String?):Boolean {
    if (text != null) {
        for(i in text) {
            if (!i.isDigit() && !i.equals(' ')&&!i.equals('-')) return false
        }
    }
    return true
}

fun keepNumber(text: String?) = if (isNumberCard(text)) {
    var result = ""
    for(i in text!!) if(i.isDigit()) result +=i
    result
} else null

