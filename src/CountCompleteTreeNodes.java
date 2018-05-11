/**
 * Given a complete binary tree, count the number of nodes.

 Note:

 Definition of a complete binary tree from Wikipedia:
 In a complete binary tree every level, except possibly the last, is completely filled,
 and all nodes in the last level are as far left as possible.
 It can have between 1 and 2h nodes inclusive at the last level h.

 Example:

 Input:
     1
    / \
   2   3
  / \  /
 4  5 6

 Output: 6
 */

// time : O(logn * logn)
// space : O(n)


public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        int left = leftdepth(root);
        int right = rightdepth(root);
        if(left == right){
            return (1 << left) -1;
        }else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

    }
    public static int leftdepth(TreeNode root){
        int res = 0;
        while(root != null){
            root = root.left;
            res++;
        }
        return res;
    }

    public static int rightdepth(TreeNode root){
        int res = 0;
        while(root != null){
            root = root.right;
            res++;
        }
        return res;
    }
}
