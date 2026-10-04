class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size -1
        while(left < right){
            val currentSum = numbers[left] + numbers[right]
            if(currentSum > target){
                right--
            } else if (currentSum < target) {
                left++
            } else if (currentSum == target){
                return intArrayOf(left+1, right+1)
            }
        }
        return numbers
    }
}
