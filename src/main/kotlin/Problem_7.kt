fun reverse(x: Int): Int {
    var num = x.toString()
    var reversed = ""

    if (x < 0) {
        reversed += "-"
        num = num.drop(1)
    }

    for (char in num.reversed()) {
        reversed += char
    }

    return try {
        reversed.toInt()
    } catch (_: NumberFormatException) {
        0
    }
}

fun main() {
    println(reverse(123))
    println(reverse(-123))
}