import javax.swing.tree.TreeNode;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * For example, given
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 *       3
 *      / \
 *     9  20
 *   /  \
 *  15   7
 *
 */


// time : O(n)
// space : O(n)


public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0, inorder.length -1, preorder, inorder);

    }

    public TreeNode helper(int prestart, int instart, int inend, int[] preorder, int[] inorder){
        if(prestart > preorder.length -1 || instart > inend){
            return null;
        }
        TreeNode root = new TreeNode(preorder[prestart]);
        int inindex = 0;
        for (int i = instart; i <= inend; i++){
            if (inorder[i] == root.val){
                inindex = i;
            }
        }
        root.left = helper(prestart + 1, instart, inindex -1, preorder, inorder);
        root.right = helper(prestart + inindex - instart +1, inindex + 1, inend, preorder, inorder);
        return root;
    }
}
