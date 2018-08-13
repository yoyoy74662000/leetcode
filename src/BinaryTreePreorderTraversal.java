/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 Example:
 Input: [1,null,2,3]
    1
     \
      2
     /
    3

 Output: [1,2,3]
 Follow up: Recursive solution is trivial, could you do it iteratively?
 */

// time: O(n) / O(n)
// space: O(n) / O(n)

public class BinaryTreePreorderTraversal {
    //iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            if(cur.right != null) stack.push(cur.right);
            if(cur.left != null) stack.push(cur.left);

            res.add(cur.val);
        }
        return res;
    }
}

public class BinaryTreePreorderTraversal2 {
    //recursion
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return res;
        if(root != null) res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return res;
    }
}