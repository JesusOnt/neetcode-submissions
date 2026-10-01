class Solution {
    fun isPalindrome(s: String): Boolean {
        return s.lowercase().filter { it.isLetterOrDigit() }.toCharArray().let {
            it.contentEquals(it.reversedArray())
        }
    }
}
