/**
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * Example:

 Input: [1,2,3,null,5,null,4]
 Output: [1, 3, 4]
 Explanation:

    1            <---
  /   \
 2     3         <---
 \     \
 5     4       <---
 *
 */


// time: O(n)
// space: O(n)

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        helper(res, root, 0);
        return res;
    }
    public static void helper(List<Integer> res, TreeNode root, int level){
        if(root == null) return;
        if(res.size() == level){
            //先level 再來增加 size
            res.add(root.val);
        }
        helper(res, root.right, level + 1);
        helper(res, root.left, level + 1);
    }
}

public class BinaryTreeRightSideView2 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        helper(list, queue, root);
        return list;
    }
    public void helper(List<Integer> list, Queue<TreeNode> queue, TreeNode root){
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode cur = queue.poll();
                if(i == 0){
                    list.add(cur.val);
                }
                if(cur.right != null) queue.offer(cur.right);
                if(cur.left != null) queue.offer(cur.left);
            }

        }
    }
}