/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia:
 * “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
 *
 *          ______3_______
 *         /              \
 *     ___5__          ___1__
 *    /      \        /      \
 *    6      2       0       8
 *  /  \
 * 7   4
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3.
 * Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 */

//time : O(n)
//space : O(1)
public class LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //舉例來說 p = 5 q = 2
        //最後返回 left = 5 right = null
        // return 5

        if (left != null && right != null) {
            return root;
        } else {
            return left == null ? right : left;
        }

    }
}
