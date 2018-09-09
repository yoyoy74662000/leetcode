/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

 Find the minimum element.

 The array may contain duplicates.

 Example 1:

 Input: [1,3,5]
 Output: 1
 Example 2:

 Input: [2,2,2,0,1]
 Output: 0
 *
 *
 */
public class FindMinimuminRotatedSortedArrayII {
    public int findMin(int[] nums) {
        if(nums.length == 0) return -1;
        int start = 0;
        int end = nums.length -1;
        while(start + 1 < end){
            int mid = (end - start) / 2 + start;
            if(nums[mid] < nums[end]){
                end = mid;
            }else if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end--;
            }
        }
        if(nums[start] <= nums[end]) return nums[start];
        else return nums[end];
    }
}
