/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * Return all possible palindrome partitioning of s.
 * Example:
 * Input: "aab"
 * Output:
 [
 ["aa","b"],
 ["a","a","b"]
 ]
 *
 */

// time: O(2^n)
// space: O(n)

public class PalindromePartitioning{
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if(s == null || s.length() == 0 ) return res;
        List<String> temp = new ArrayList<>();
        helper(res, temp, s);
        return res;
    }

    public static void helper(List<List<String>> res, List<String> list, String s){
        if(s.length() == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(isPalindrome(s.substring(0, i+1))){
                //先判斷 是否有 回文
                list.add(s.substring(0, i+1));
                //再 add
                helper(res, list, s.substring(i+1));
                // 再下一個substring 的 循環
                list.remove(list.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
