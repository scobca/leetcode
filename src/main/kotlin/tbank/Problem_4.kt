package tbank

fun problem4(): String {
    val (n, initialK) = readln().split(" ").map { it.toInt() }
    var k = initialK

    var left = 1
    var right = n
    val answer = mutableListOf<Int>()

    while (left <= right) {
        val inversions = right - left

        if (k >= inversions) {
            answer.add(right--)
            k -= inversions
        } else {
            answer.add(left++)
        }
    }

    return answer.joinToString(" ")
}

fun main() {
    print(problem4())
}