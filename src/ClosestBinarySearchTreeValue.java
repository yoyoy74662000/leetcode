/**
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
 * <p>
 * Note:
 * <p>
 * Given target value is a floating point.
 * You are guaranteed to have only one unique value in the BST that is closest to the target.
 * Example:
 * <p>
 * Input: root = [4,2,5,1,3], target = 3.714286
 * <p>
 *      4
 *     / \
 *    2   5
 *   / \
 *  1   3
 * <p>
 * Output: 4
 */
public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        if (root == null) return 0;
        return helper(root, target, root.val);
    }

    public int helper(TreeNode root, double target, int val) {
        if (root == null) return val;

        if (Math.abs(root.val - target) < Math.abs(target - val)) {
            val = root.val;
        }

        if (root.val > target) {
            val = helper(root.left, target, val); // (2, 3.7, 4)
        } else if (root.val < target) {
            val = helper(root.right, target, val); // (3, 3.7, 4) null return val
        }
        return val;
    }
}
