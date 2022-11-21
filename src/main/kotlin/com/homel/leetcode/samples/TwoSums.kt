package com.homel.leetcode.samples

import com.homel.leetcode.samples.TwoSum.twoSum

class TwoSums {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val res = intArrayOf(0, 1)

        if (nums.size == 2) return res

        val map = mutableMapOf<Int, Int>()


        nums.forEachIndexed { i, item ->
            if (map.containsKey(target - item)) {
                res[0] = map.get(target - item)!!
                res[1] = i
                return res
            } else {
                map.put(item, i)
            }
        }


        return res
    }
}

fun main() {
    println(twoSum(intArrayOf(2,7,11,15), 9).forEach { println(it) })
}