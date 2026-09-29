class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val grouped = nums.groupBy{it}.values.sortedByDescending { l -> l.size }
        return grouped.take(k).map{it.first()}.toIntArray()
    }
}
