import javax.swing.tree.TreeNode;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * For example, given the following binary tree:
 *    1
    /   \
   2     3
   \
    5
 *
 *
 */

// time : O(n)
// space : O(n)

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root == null) return res;
        helper(res, root, "");
        return res;
    }

    public static void helper(List<String> res, TreeNode root, String path){
        if(root.left == null && root.right == null)
            res.add(path + root.val);
        if (root.left != null)
            helper(res, root.left, path + root.val + "->");
        if (root.right != null)
            helper(res, root.right, path + root.val + "->");

    }
}
