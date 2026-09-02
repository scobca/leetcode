package tbank

fun problem2() {
    val n = readln().toInt()
    val strArr = List(n) { readln() }
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedByDescending { it.second }
        .let { list ->
            val maxCount = list.maxOf { it.second }
            list.filter { it.second == maxCount }
        }
        .sortedBy { it.first }

    for (i in strArr.indices) println(strArr[i].first)
}

fun main() {
    problem2()
}
