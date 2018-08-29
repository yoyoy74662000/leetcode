/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

 Find the minimum element.

 You may assume no duplicate exists in the array.

 Example 1:

 Input: [3,4,5,1,2]
 Output: 1

 Example 2:

 Input: [4,5,6,7,0,1,2]
 Output: 0
 */

// time: O(n)
// space: O(1)


public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums.length == 0) return -1;
        int start = 0;
        int end = nums.length -1;
        while(start + 1 < end){
            int mid = (end - start) / 2 + start;
            if(nums[mid] < nums[end]){
                end = mid;
            }else{ // [1,3,3] 類似有重複
                start = mid + 1;
            }
        }
        if(nums[start] < nums[end]) return nums[start];
        else return nums[end];
    }
}
