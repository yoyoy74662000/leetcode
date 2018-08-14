/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

 Note: A leaf is a node with no children.

 Example:

 Given the below binary tree and sum = 22,

        5
       / \
      4   8
     /   / \
    11  13  4
   /  \    / \
  7    2  5   1
 Return:

 [
    [5,4,11,2],
    [5,8,4,5]
 ]
 *
 */


// time: O(n)
// space: O(n)

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        List<Integer> list = new ArrayList<>();
        helper(res, list, root, sum);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> list, TreeNode root, int sum){
        if(root == null) return;
        list.add(root.val);
        if(root.left == null && root.right == null) {
            if(sum == root.val){
                res.add(new ArrayList<>(list));
            }
        }
        helper(res, list, root.left, sum-root.val);
        helper(res, list, root.right, sum-root.val);
        list.remove(list.size()-1);
    }
}
