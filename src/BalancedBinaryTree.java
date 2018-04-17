import javax.swing.tree.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Given the following tree [3,9,20,null,null,15,7]:
 *
        3
       / \
      9  20
        /  \
       15   7
 *
 *
 */

// time : O(n)
// space : O(n)

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if( root == null ) return true;
        return helper(root) != -1;
    }

    public int helper( TreeNode root){
        if( root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        } else{
            return Math.max(left,right)+1;
        }
    }
}
