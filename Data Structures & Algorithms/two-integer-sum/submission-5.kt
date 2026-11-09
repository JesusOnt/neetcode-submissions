class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()

        nums.forEachIndexed{ i, n ->
            if(map.contains(target - n)){
                return intArrayOf(map.getValue(target-n), i)
            }else{
                map.put(n, i)
            }
        }
        return intArrayOf()
    }
}
