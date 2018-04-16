/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *       1
 *      / \
 *     2   2
 *    / \ / \
 *   3  4 4  3
 *
 *
 */
// time : O(n)
// space : O(n)

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symmetric(root.left, root.right);
    }

    public static boolean symmetric(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if((p == null && q != null) || (p != null && q == null)) return false;
        if(p.val != q.val) return false;
        else{
            return symmetric(p.left, q.right) && symmetric(p.right, q.left);
        }
    }
}
