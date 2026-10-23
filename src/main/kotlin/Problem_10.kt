fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.lastIndex
    var best = 0

    while (left < right) {
        val area = minOf(height[left], height[right]) * (right - left)
        best = maxOf(best, area)

        if (height[left] <= height[right]) {
            left++
        } else {
            right--
        }
    }

    return best
}

fun main() {
    println(maxArea(intArrayOf(1, 1)))
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}