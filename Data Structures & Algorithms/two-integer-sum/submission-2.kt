class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var i = 0
        var j = nums.size - 1
        while (i < nums.size -2){
            if (nums[i]+nums[j] == target) return intArrayOf(i,j)
            if (i+1 == j){
                j = nums.size -1
                i++
            } else j--
        }
        return intArrayOf(i,j)
    }
}
