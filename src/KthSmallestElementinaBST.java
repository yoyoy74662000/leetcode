/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

 Note:
 You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

 Example 1:

 Input: root = [3,1,4,null,2], k = 1
 Output: 1

 Example 2:

 Input: root = [5,3,6,2,4,null,null,1], k = 3
 Output: 3
 *
 *         5
          / \
         3   6
        / \
       2   4
      /
     1
 */

// time: O(n)
// space: O(n)

public class KthSmallestElementinaBST {
    private int count = 0, res = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return res;
    }

    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        count--;
        if(count == 0){
            res = root.val;
        }
        helper(root.right);
    }
}

public class KthSmallestElementinaBST2 {
    private static int res = 0, count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        count = k;
        helper(root);
        return res;
    }

    public static void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        count--;
        if(count == 0){
            res = root.val;
        }
        helper(root.right);
    }
}
