fun isPalindrome(x: Int): Boolean {
    val strX = x.toString()
    var right = strX.length - 1

    for (left in (0.. (strX.length / 2))) {
        if (strX[left] != strX[right]) {
            return false
        }

        right--
    }
    return true
}

fun main() {
    println(isPalindrome(121))
    println(isPalindrome(1221))
    println(isPalindrome(123))
    println(isPalindrome(1223))
}