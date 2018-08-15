/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *For example:
 *Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
 *
 *return its depth = 3.
 */
// time : O(n)
// space : O(n)----> recursion
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return helper(root);
    }

    public int helper(TreeNode root){
        if( root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);

        return Math.max(left,right)+1;
    }
}
