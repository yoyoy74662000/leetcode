/**
 * Given a binary tree, flatten it to a linked list in-place.
 * For example,
 * Given
 *      1
 *     / \
 *    2   5
 *   / \   \
 *  3   4   6
 *  The flattened tree should look like:
 *  1
 *   \
 *    2
 *     \
 *      3
 *       \
 *        4
 *         \
 *          5
 *           \
 *            6
 *
 * 6.right = null
 prev = root ——>   6 —>null
                   ^
                  prev
 5.right = prev
 prev = root ——>   5—>  6 —>null
                   ^
                  prev
 4.right = prev
 prev = root ——>   4 –> 5 —>  6 —>null
                   ^
                  prev
 3.right = prev
 prev = root ——>  3 —>  4 –> 5 —>  6 —> null
                  ^
                 prev
 2.right = prev
 prev = root ——>  2 —> 3 —>  4 –> 5 —>  6 —> null
                  ^
                 prev
 1.right = prev
 prev = root ——>  1—> 2 —> 3 —>  4 –> 5 —>  6 —> null
                  ^
                 prev
 *
 */

// time: O(n)
// space: O(n)

public class FlattenBinaryTreetoLinkedList {
    public TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

}
