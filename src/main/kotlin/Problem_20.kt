import java.util.Stack

fun isValid(s: String): Boolean {
    val brackets = Stack<Char>()

    fun getPair(bracket: Char): Char {
        return when (bracket) {
            ')' -> '('
            ']' -> '['
            else -> '{'
        }
    }

    for (i in s.indices) {
        val bracket = s[i]

        if (bracket == '(' || bracket == '[' || bracket == '{') {
            brackets.push(bracket)
            continue
        }

        if (brackets.empty() || getPair(bracket) != brackets.peek()) {
            return false
        } else brackets.pop()
    }

    return brackets.empty()
}

fun main() {
    println(isValid("()"))
    println(isValid("[](){}"))
    println(isValid("({}){[}]"))
    println(isValid("([])"))
    println(isValid(")"))
}