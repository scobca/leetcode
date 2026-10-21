fun convert(s: String, numRows: Int): String {
    if (numRows == 1 || numRows >= s.length) return s

    val rows = Array(numRows) { StringBuilder() }
    var row = 0
    var direction = 1

    for (char in s) {
        rows[row].append(char)

        if (row == 0) direction = 1
        if (row == numRows - 1) direction = -1

        row += direction
    }

    return rows.joinToString("") { it.toString() }
}

fun main() {
    println(convert("PAYPALISHIRING", 3))
    println(convert("PAYPALISHIRING", 4))
}