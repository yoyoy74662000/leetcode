/**
 * Given a string s, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.

 Example 1:

 Input: "aacecaaa"
 Output: "aaacecaaa"
 Example 2:

 Input: "abcd"
 Output: "dcbabcd"
 *
 *
 *
 */
public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        int i = 0;
        int end = s.length()-1;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                i = 0;
                end--;
                j = end;
            }
        }
        return new StringBuilder(s.substring(end+1)).reverse().toString()+s;
    }
}
