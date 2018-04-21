/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

 An example is the root-to-leaf path 1->2->3 which represents the number 123.

 Find the total sum of all root-to-leaf numbers.

 Note: A leaf is a node with no children.

 Example:

 Input: [1,2,3]
     1
    / \
   2   3
 Output: 25
 Explanation:
 The root-to-leaf path 1->2 represents the number 12.
 The root-to-leaf path 1->3 represents the number 13.
 Therefore, sum = 12 + 13 = 25.
 */

// time: O(n)
// space: O(n)

public class SumRoottoLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public static int helper(TreeNode root, int sum) {
        if (root == null) return 0;

        sum = sum * 10 + root.val;

        if (root.left == null && root.right == null) {
            return sum;
        }
        int left = helper(root.left, sum);
        int right = helper(root.right, sum);

        return left + right;
    }
}
