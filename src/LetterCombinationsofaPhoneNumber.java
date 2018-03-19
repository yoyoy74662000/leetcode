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

// time : O(3^n)
// space : O(n)

public class LetterCombinationsofaPhoneNumber {
    private String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;

        helper(res, digits, "", 0);
        return res;
    }

    public void helper(List<String> res, String digits, String s, int index){
        if (index == digits.length()){
            res.add(s);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++){
            helper(res, digits, s + letters.charAt(i), index + 1);
        }
    }
}
