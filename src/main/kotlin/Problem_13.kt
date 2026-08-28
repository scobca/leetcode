fun romanToInt(s: String): Int {
    val romanIntegers = hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var sum = 0

    for (i in s.length - 1 downTo 0) {
        val curr = romanIntegers[s[i]]!!

        if (sum != 0) {
            if (curr < romanIntegers[s[i + 1]]!!) sum -= curr
            else sum += curr

            continue
        }
        sum += curr
    }

    return sum
}

fun main() {
    println(romanToInt("VI"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}