/**
 *  Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

 Example 1:

 Input: "aba"
 Output: True

 Example 2:

 Input: "abca"
 Output: True
 Explanation: You could delete the character 'c'.

 */

// time : O(n)
// space : O(1)


public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++; j--;
        }

        if (i >= j) return true;

        if (isPalin(s, i + 1, j) || isPalin(s, i, j - 1)) return true;
        return false;
    }

    private boolean isPalin(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++; j--;
            }
            else return false;
        }
        return true;
    }
}
