package tbank

fun problem3(): Int {
    val (n, t) = readln().split(" ").map { it.toInt() }
    val motions = readln().split(" ").map { it.toInt() }

    val str = MutableList(n) { 0 }
    val col = MutableList(n) { 0 }
    var (dia1, dia2) = listOf(0, 0)

    fun getRow(num: Int): Int = (num - 1) / n
    fun getCol(num: Int): Int = (num - 1) % n

    fun isMainDiagonal(num: Int): Boolean {
        val (row, col) = listOf(getRow(num), getCol(num))
        return row == col
    }

    fun isSecondaryDiagonal(num: Int): Boolean {
        val (row, col) = listOf(getRow(num), getCol(num))
        return row + col == n - 1
    }

    for (i in 0..<t) {
        str[getRow(motions[i])]++
        col[getCol(motions[i])]++
        if (isMainDiagonal(motions[i])) dia1++
        if (isSecondaryDiagonal(motions[i])) dia2++

        if (str.any {it == n} || col.any {it == t} || dia1 == n || dia2 == n) {
            return i + 1
        }
    }
    return -1
}

fun main() {
    print(problem3())
}