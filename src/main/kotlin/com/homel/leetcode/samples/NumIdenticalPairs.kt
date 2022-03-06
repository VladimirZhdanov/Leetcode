package com.homel.leetcode.samples

fun numIdenticalPairs(nums: IntArray): Int {

    var result = 0

    for (i in nums.indices) {
        for (j in nums.indices) {
            if (nums[i] == nums[j] && i < j) result++
        }
    }
    return result
}

fun main() {
    println(numIdenticalPairs(intArrayOf(1, 1, 1, 1)))
}