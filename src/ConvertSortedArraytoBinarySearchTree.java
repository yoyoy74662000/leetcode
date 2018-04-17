import javax.swing.tree.TreeNode;

/** Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of
 * every node never differ by more than 1.
 *
 * Given the sorted array: [-10,-3,0,5,9],
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5

 array.length : length is a final variable applicable for arrays. With the help of length variable, we can obtain the size of the array.
 string.length() : length() method is a final variable which is applicable for string objects. length() method returns the number of characters presents in the string.
 */
// time : O(n)
// space : O(n)
// 你好，可以再解释一下为什么这个栈空间是O(logN)，但是整体的复杂度是O(n)吗?﻿因为每次进行二分，整体是因为每次创建新的节点

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return helper(nums, 0, nums.length - 1);

    }

    public TreeNode helper(int[]nums, int left, int right){
        if(left > right) return null;
        int mid = (right - left) / 2 + left;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid -1);
        node.right = helper(nums, mid + 1, right);
        return node;
    }
}
