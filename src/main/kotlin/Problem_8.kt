fun myAtoi(s: String): Int {
    val digits =
        hashMapOf('0' to 0, '1' to 1, '2' to 2, '3' to 3, '4' to 4, '5' to 5, '6' to 6, '7' to 7, '8' to 8, '9' to 9)

    var sign = 1
    var i = 0
    var res = 0

    for (char in s.trim()) {
        if (digits.containsKey(char)) {
            i++
            val digit = digits[char]!!
            val limit = if (sign == -1) Int.MIN_VALUE else -Int.MAX_VALUE

            if (res < limit / 10 || (res == limit / 10 && -digit < limit % 10)) {
                return if (sign == -1) Int.MIN_VALUE else Int.MAX_VALUE
            }

            res = res * 10 - digit
        } else {
            if (i == 0) {
                if (char == '-' && sign == 1) {
                    i++
                    sign = -1
                    continue
                } else if (char == '+') {
                    i++
                    sign = 1
                    continue
                }
                break
            }
            break
        }
    }

    return if (sign == -1) res else -res
}

fun main() {
    println(myAtoi("1337c0d3"))
    println(myAtoi("   -042"))
    println(myAtoi("42"))
    println(myAtoi("-91283472332"))
}
