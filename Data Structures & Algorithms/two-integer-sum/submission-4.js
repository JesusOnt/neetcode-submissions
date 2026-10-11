class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
      let i = 0
      let j = nums.length - 1
      while(i < nums.length - 2){
        if(nums[i] + nums[j] == target) return [i,j]
        if(i+1 == j){
          j = nums.length -1
          i++
        } else j--
      }
      return [i,j]
    }
}
