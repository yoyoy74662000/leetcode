/**
 * Implement an iterator over a binary search tree (BST).
 * Your iterator will be initialized with the root node of a BST.
 * Calling next() will return the next smallest number in the BST.
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory,
 * where h is the height of the tree.
 */

public class BinarySearchTreeIterator {
    /**
     * Definition for binary tree
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    public class BSTIterator {

        private Stack<TreeNode> stack;
        private TreeNode cur;

        public BSTIterator(TreeNode root) {
            stack = new Stack<>();
            cur = root;
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            if(!stack.isEmpty() || cur != null) return true;
            return false;
        }

        /** @return the next smallest number */
        public int next() {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode t = stack.pop() ;
            cur = t.right ;
            return t.val;
        }
    }

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
