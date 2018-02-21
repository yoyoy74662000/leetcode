/**
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
       3
      / \
     9  20
       /  \
      15   7
 * return its bottom-up level order traversal as:
    [
    [15,7],
    [9,20],
    [3]
    ]
 *
 */

// time : O(n)
// space : O(n)

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // list 裡面的object 的list 裡面的object 是 Integer
        List<List<Integer>> result = new ArrayList<>();
        if( root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        // 先add 後poll
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            // and add into a list
            List<Integer> list = new ArrayList<>();
            for(int i =0; i < size; i++){
                TreeNode cur = queue.poll();
                // 3.left
                if(cur.left != null) queue.offer(cur.left);
                // 3.right
                if(cur.right != null) queue.offer(cur.right);
                // 這裏就是add 3 into list
                list.add(cur.val);
            }
            result.add(0,list) ;
        }
        return result;
    }
}
