/**
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

 Note:

 Given target value is a floating point.
 You are guaranteed to have only one unique value in the BST that is closest to the target.
 Example:

 Input: root = [4,2,5,1,3], target = 3.714286

        4
       / \
      2   5
     / \
    1   3

 Output: 4
 *
 */
public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        if(root == null) return 0;
        return helper(root, target, root.val);
    }

    public int helper(TreeNode root, double target, int val){
        if(root == null) return val;

        if(Math.abs(root.val - target) < Math.abs(target - val)){
            val = root.val;
        }

        if(root.val > target){
            val = helper(root.left, target, val);
        }else if(root.val < target){
            val = helper(root.right, target, val);
        }
        return val;
    }
}
