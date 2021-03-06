/**
 * Given a binary search tree (BST) with duplicates,
 * find all the mode(s) (the most frequently occurred element) in the given BST.
 *  For example:
 Given BST [1,null,2,2],

        1
         \
          2
         /
        2
 return [2].
 *
 *
 */

// time: O(n)
// space: O(n)

public class FindModeinBinarySearchTree {
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int qSize = queue.size();
            for (int i = 0; i < qSize; i++) {
                TreeNode node = queue.poll();
                map.put(node.val, map.getOrDefault(node.val, 0) + 1);
                max = Math.max(max, map.get(node.val));
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        List<Integer> list = new LinkedList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == max)
                list.add(key);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = list.get(i);
        return res;
    }
}
