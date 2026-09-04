fun longestCommonPrefix(strs: Array<String>): String {
    val ref = strs[0]

    for (i in ref.indices) {
        val char = ref[i]
        for (j in 1 until strs.size) {
            if (i >= strs[j].length || strs[j][i] != char) {
                return ref.substring(0, i)
            }
        }
    }

    return ref
}

fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
}