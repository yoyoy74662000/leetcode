/**
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 Example 1:

 Input: "(()"
 Output: 2
 Explanation: The longest valid parentheses substring is "()"
 Example 2:

 Input: ")()())"
 Output: 4
 Explanation: The longest valid parentheses substring is "()()"

 *
 *
 */


// time: O(n)
// space: O(n)


public class LongestValidParentheses {
    Stack<Integer> stack = new Stack<>();
    int res = 0;
    int start = -1;
        for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            stack.push(i);
        } else {
            if (stack.isEmpty()) {
                start = i;
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    res = Math.max(res, i - start);
                } else {
                    res = Math.max(res, i - stack.peek());
                }
            }
        }
    }
        return res;
}
