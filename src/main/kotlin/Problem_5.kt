fun longestPalindrome(s: String): String {
    var bestStart = 0
    var bestLength = 0

    fun expand(left: Int, right: Int) {
        var l = left
        var r = right

        while (l >= 0 && r < s.length && s[l] == s[r]) {
            val length = r - l + 1
            if (length > bestLength) {
                bestStart = l
                bestLength = length
            }
            l--
            r++
        }
    }

    for (med in s.indices) {
        expand(med, med)
        expand(med, med + 1)
    }

    return s.substring(bestStart, bestStart + bestLength)
}

fun main() {
    println(longestPalindrome("ababa"))
    println(longestPalindrome("babad"))
    println(longestPalindrome("cbbd"))
    println(longestPalindrome("bb"))
}