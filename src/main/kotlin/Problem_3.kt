fun lengthOfLongestSubstring(s: String): Int {
    var maxLength = 0
    val letters = hashMapOf<Char, Int>()
    var left = 0

    for (i in s.indices) {
        val char = s[i]

        if (letters.containsKey(char) && letters[char]!! >= left) {
            left = letters[char]!! + 1
        }

        letters[char] = i
        maxLength = maxOf(maxLength, i - left + 1)
    }

    return maxLength
}

fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
    println(lengthOfLongestSubstring("bbbbb"))
    println(lengthOfLongestSubstring("eea"))
}