/**
 * Binary Tree Upside Down
 * Given a binary tree with a specific structure - all right nodes are either:
 * 1. leaf nodes with a left sibling or 2. empthy.
 * Reverse it into a new tree where the origin al right nodes
 * becoming new left leaf nodes. Return the new root.
 *   1                4
    /  \             / \
   2    3   ->      5   2
  / \                  / \
 4   5                3   1
 *
 *
 */

// time: O(n)
// space: O(n)

public class BinaryTreeUpsideDown {
    public TreeNode upsideDownBinaryTree(TreeNode root){
        if(root == null || root.left == null & root.right == null){
            return root;
        }

        TreeNode newRoot = upsideDownBinaryTree(root.left);
        root.left.left = root.right;
        root.left.right = root;

        root.left = null;
        root.right = null;
        return newRoot;
    }
}
