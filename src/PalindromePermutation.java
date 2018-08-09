/**
 * Example 1:

 Input: "code"
 Output: false
 Example 2:

 Input: "aab"
 Output: true
 Example 3:

 Input: "carerac"
 Output: true
 *
 */

public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        char[] c = s.toCharArray();
        for(char t : c){
            if(set.contains(t)){
                set.remove(t);
            }else{
                set.add(t);
            }
        }
        return set.size()<=1;
    }
}
