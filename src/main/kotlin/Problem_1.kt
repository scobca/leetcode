fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashNums = hashMapOf<Int, Int>()

    for (i in nums.indices) {
        val diff = target - nums[i]

        if (hashNums.containsKey(diff))
            return intArrayOf(hashNums[diff]!!, i)

        hashNums[nums[i]] = i
    }

    return intArrayOf()
}

fun main() {
    twoSum(intArrayOf(2, 7, 11, 15), 9)
    twoSum(intArrayOf(3, 2, 4), 6)
    twoSum(intArrayOf(3, 2), 6)
}