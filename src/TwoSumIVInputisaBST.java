/**
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

 Example 1:

 Input:
        5
       / \
      3   6
     / \   \
    2   4   7

 Target = 9

 Output: True

 *
 */

// time : O(n)
// space : O(n)

public class TwoSumIVInputisaBST {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        inorder(nums, root);
        int i = 0, j = nums.size()-1;
        while(i < j){
            if(nums.get(i) + nums.get(j) == k){
                return true;
            }else if(nums.get(i) + nums.get(j) < k){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }

    public void inorder(List<Integer> nums, TreeNode root){
        if (root == null) return;
        inorder(nums, root.left);
        nums.add(root.val);
        inorder(nums, root.right);
    }
}
