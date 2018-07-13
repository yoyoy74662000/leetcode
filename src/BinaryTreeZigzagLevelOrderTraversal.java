/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values.
 * (ie, from left to right, then right to left for the next level and alternate between).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *   3
 *  / \
 * 9  20
  / \
 15  7


 * return its zigzag level order traversal as:
 *
 [
 [3],
 [20,9],
 [15,7]
 ]
 *
 * [3] true
 * [20,9] false
 * [15,7] true
 *
 *
 */


// time: O(n)
// space: O(n)


public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean x = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode cur = queue.poll();
                // if true 的話由左到右
                if(x){
                    list.add(cur.val);
                }else{
                //如果是false的話 由右到左
                    list.add(0,cur.val);
                }
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            x = x ? false : true;
            res.add(list);
        }
        return res;
    }
}
