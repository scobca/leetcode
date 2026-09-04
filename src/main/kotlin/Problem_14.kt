fun longestCommonPrefix(strs: Array<String>): String {
    var longestCommonPrefix = ""
    val ref = strs[0]
    val arrSize = strs.size

    for (i in ref.indices) {
        longestCommonPrefix += ref[i]
        if (strs.filter { it.startsWith(longestCommonPrefix) }.size != arrSize) {
            longestCommonPrefix = longestCommonPrefix.dropLast(1)
            break
        }
    }

    return longestCommonPrefix
}

fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
}