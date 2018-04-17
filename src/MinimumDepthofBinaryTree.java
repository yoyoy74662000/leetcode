/**
 *
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *      1      2
       / \
  1   4   5    2
         / \
        2   6  1

 */

// time : O(n)
// space : O(n)

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null || root.right == null){
            return Math.max(minDepth(root.left),minDepth(root.right)) + 1;
        }else{
            return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
        }
    }
}
