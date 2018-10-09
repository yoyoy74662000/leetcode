import javax.swing.tree.TreeNode;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * For example, given the following binary tree:
 *     1
     /   \
    2     3
   / \
  4  5
 *
 *
 */

// time : O(n)
// space : O(n)

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        helper(root, res, "");
        return res;
    }


    public void helper(TreeNode root, List<String> res, String s){
        if(root.left == null && root.right == null){
            res.add(s + root.val);
        }

        if(root.left != null){
            helper(root.left, res, s + root.val + "->");
        }

        if(root.right != null){
            helper(root.right, res, s + root.val + "->");
        }
    }
}
