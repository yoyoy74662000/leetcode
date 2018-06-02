/**
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

 Example:

 Input:

     1
      \
      3
     /
    2

 Output:
 1

 Explanation:
 The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).

 *
 *
 */

// time : O(n)
// space : O(n)

public class MinimumAbsoluteDifferenceinBST {
    private int mindiff = Integer.MAX_VALUE;
    private int preval = -1;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return mindiff;
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(preval != -1){
            mindiff = Math.min(mindiff, Math.abs(root.val - preval));
        }
        preval = root.val;
        inorder(root.right);

    }
}
