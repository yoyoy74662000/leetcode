/**
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

 This is case sensitive, for example "Aa" is not considered a palindrome here.

 Note:
 Assume the length of given string will not exceed 1,010.

 Example:

 Input:
 "ab cc cc dd"

 Output:
 7

 Explanation:
 One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 *
 */
public class longestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count++;
            }else{
                set.add(c);
            }
        }
        if(set.size() != 0){
            return count*2 + 1;
        }else{
            return count*2;
        }
    }
}
