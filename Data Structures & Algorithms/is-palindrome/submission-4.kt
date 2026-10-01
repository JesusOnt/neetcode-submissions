class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length -1
        while(i < j){
            if(!s[i].isLetterOrDigit()){
                i++
            }
            else if(!s[j].isLetterOrDigit()){
                j--
            }
            else if (s[j].lowercase() != s[i].lowercase()){
                return false
            }
            else if (s[j].lowercase() == s[i].lowercase()){
                j--
                i++
            }
        }
        return true
    }
}
