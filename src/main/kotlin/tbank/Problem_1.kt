package tbank

fun problem1(): String {
    val numsSize = readln().toInt() + 1

    // convert all input numbers into map, where map[0] - most used number, map[-1] - least used
    val groupedNums = readln().split(" ")
        .map { it.toInt() }
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedByDescending { it.first }

    if (groupedNums[0].second != numsSize - 2) return "NO"

    var sum = 0
    groupedNums.drop(1).forEach { sum += it.first * it.second }

    if (sum != groupedNums[0].first) return "NO"
    return "YES"
}

fun main() {
    print(problem1())
}