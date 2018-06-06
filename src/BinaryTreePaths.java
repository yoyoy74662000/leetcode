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
        List<String> string = new ArrayList<>();
        if(root == null) return string;
        helper(string, root, "");
        return string;
    }
    
    public void helper(List<String> string, TreeNode root, String res){
        if(root.left == null && root.right == null){
            string.add(res + root.val);
        }
        if(root.left != null){
            // string.add(res + root.val);
            helper(string, root.left, res + root.val + "->");    
        }
        
        if(root.right != null){
            // string.add(res + root.val);
            helper(string, root.right, res + root.val + "->");    
        }   
    }
}
