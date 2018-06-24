/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).

 You are given a target value to search. If found in the array return true, otherwise return false.

 Example 1:

 Input: nums = [2,5,6,0,0,1,2], target = 0
 Output: true
 Example 2:

 Input: nums = [2,5,6,0,0,1,2], target = 3
 Output: false
 Follow up:

 This is a follow up problem to Search in Rotated Sorted Array, where nums may contain duplicates.
 Would this affect the run-time complexity? How and why?
 *
 *
 */

// time : O(logn)
// space : O(1)


public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return false;
        int start = 0, end = nums.length -1;
        while (start + 1 < end){
            int mid = (end - start ) / 2 + start;
            if (nums[mid] == target){
                return true;
            }


            //多加這行，判斷前後重複
            //[1,1,1,3,1]
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }
            // 注意這邊
            // [4,5,6,7,0,1,2]
            else if (nums[start] <= nums[mid]){
                // 注意這邊
                if (nums[start] <= target && target <= nums[mid]){
                    end = mid;
                }else{
                    start = mid;

                }
            }else{
                // 注意這邊
                //[6,7,0,1,2,4,5]
                if (nums[mid] <= target && target <= nums[end]){
                    start = mid;
                }else{
                    end = mid;
                }
            }
        }
        if (nums[start] == target){
            return true;
        }
        if (nums[end] == target){
            return true;
        }
        return false;
    }
}
