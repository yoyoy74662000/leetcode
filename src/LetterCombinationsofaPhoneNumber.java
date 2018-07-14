import java.util.ArrayList;
import java.util.List;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 *
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 */

// time : O(3^n) 时间复杂度：假设总共有n个digit，每个digit可以代表k个字符，那么时间复杂度是O(k^n)，就是结果的数量,所以是O(3^n)
// space : O(n)

public class LetterCombinationsofaPhoneNumber {
    private String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits == null || digits.length() == 0) return list;
        helper(digits, list, "", 0);
        return list;
    }

    public void helper(String digits, List<String> list, String s, int start){
        if(s.length() == digits.length()){
            list.add(s);
            return;
        }

        String letters = mapping[digits.charAt(start) - '0']; //"abc"
        for(int i = 0; i < letters.length(); i++){
            helper(digits, list, s + letters.charAt(i), start + 1);
        }
    }
}
