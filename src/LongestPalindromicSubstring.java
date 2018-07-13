/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Input: "cbbd"
 * Output: "bb"
 */

// time : O(n^2)
// space : O(1)

public class LongestPalindromicSubstring {
    String res = "";
    public String longestPalindrome(String s) {
        if (s ==null || s.length() == 0) return null;
        for (int i = 0; i < s.length(); i++){
            //odd
            helper(s, i, i);
            //even
            helper(s, i, i + 1);
        }
        return res;
    }

    public static void helper(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        String cur = s.substring(left + 1, right);
        if (cur.length() > res.length()){
            res = cur;
        }
    }
}
