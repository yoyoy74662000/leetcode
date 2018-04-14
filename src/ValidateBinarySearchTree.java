/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1:
 *      2
 *     / \
 *    1   3
 * Binary tree [2,1,3], return true.
 * Example 2:
 *      1
 *     / \
 *    2   3
 * Binary tree [1,2,3], return false.
 */

// time: O(n)
// space: O(n)

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return helper(root, null, null);
    }

    public boolean helper(TreeNode root, Integer min, Integer max){
        if(root == null) return true;
        if(min != null && root.val <= min) return false;
        if(max != null && root.val >= max) return false;
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
        }
    }

public class ValidateBinarySearchTree2 {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        Deque <TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        TreeNode pre = null;

        while(cur != null || !stack.isEmpty()) {

            // go Left for all nodes

            if(cur != null) {
                stack.offerLast(cur);
                cur = cur.left;
            } else { // When left side meet the end poll out the node to compare with last node and go right
                cur = stack.pollLast();
                if (pre != null && cur.val <= pre.val) return false;
                pre = cur;
                cur = cur.right;
            }
        }

        return true;
    }
}