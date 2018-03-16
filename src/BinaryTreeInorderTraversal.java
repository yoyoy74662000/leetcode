import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * For example:
 * Given binary tree [1,null,2,3],
 *     1
      /
     2
    / \
   3  4
 * return [1,3,2].
 * inorder : left root right
 * preorder : root left right
 * postorder : left right root
 */

// time : O()
// space : O()

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        help(res, root);
        return res;
    }

    public static void help(List<Integer> res, TreeNode root){
        if (root == null) return;
        help(res, root.left);
        res.add(root.val);
        help(res, root.right);
    }
}
/**
 * 1.left = 2
 * 2.left = 3
 * 3.left = null
 * null == null return ->  res.add(3) -> 3.right = null -> null == null return
 * res.add(2) -> 2.right = 4 -> 4.left = null -> null == null return -> res.add(4) -> 4.right = null -> null ==null return
 * res.add(1) -> 1.right = null return
 *
 */
