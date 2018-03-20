import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
    [
    "((()))",
    "(()())",
    "(())()",
    "()(())",
    "()()()"
    ]
 *
 */

// time : O(2^n)
// space : O(n)

public class GenerateParentheses {

    public static void main(String[] args){
        System.out.println(generateParenthesis(3));
    }


    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0) return res;
        helper(res, "", n, n);
        return res;
    }

    public static void helper(List<String> res, String s, int left, int right){
        if (left > right){
            return;
        }

        if (left == 0 && right == 0){
            res.add(s);
        }

        if (left > 0){
            helper(res, s + '(', left -1, right);
        }
        if (right > 0){
            helper(res, s + ')', left, right -1);
        }
    }
}
