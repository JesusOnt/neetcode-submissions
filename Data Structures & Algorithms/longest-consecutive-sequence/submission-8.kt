class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        var long = 1
        var streak = 1
        var prev : Int? = null
        nums.sorted().forEach { n -> 
            if (prev != null){
                if(prev - n == 1 || n - prev == 1){
                    streak++
                    long = maxOf(long, streak)
                } else if (n == prev){
                    
                }
                else {
                    streak = 1
                }
            }
            prev = n
        }
        return long
    }
}
