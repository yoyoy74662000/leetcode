/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

 Your algorithm's runtime complexity must be in the order of O(log n).

 If the target is not found in the array, return [-1, -1].

 Example 1:

 Input: nums = [5,7,7,8,8,10], target = 8
 Output: [3,4]
 Example 2:

 Input: nums = [5,7,7,8,8,10], target = 6
 Output: [-1,-1]
 *
 *
 */
public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstPostion(nums, target);
        result[1] = findLastPostion(nums, target);
        return result;
    }
    public int findFirstPostion(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length -1;
        while (start + 1 < end){
            int mid = (end - start ) / 2 + start;
            if (nums[mid] == target){
                end = mid;
            }else if(nums[mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }


        if(nums[start] == target) {
            return start;
        }
        if(nums[end] == target) {
            return end;
        }
        return -1;
    }

    public int findLastPostion(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length -1;
        while (start + 1 < end){
            int mid = (end - start ) / 2 + start;
            if (nums[mid] == target){
                start = mid;
            }else if(nums[mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(nums[end] == target) {
            return end;
        }

        if(nums[start] == target) {
            return start;
        }
        return -1;
    }
}
