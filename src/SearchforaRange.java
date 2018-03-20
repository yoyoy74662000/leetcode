/**
 * Given an array of integers sorted in ascending order,
 * find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */

// time : O(logn)
// space : O(1)


public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1,-1};
        int start = findstart(nums, target);
        if (start == -1) return new int[]{-1,-1};
        int end = findend(nums, target);
        return new int[]{start, end};

    }
    public static int findstart(int[] nums, int target){
        int start = 0, end = nums.length -1;
        while( start + 1 < end){
            int mid = (end - start) / 2 + start;
            if(nums[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(nums[start] == target) return start;
        if(nums[end] == target) return end;
        return -1;

    }

    public static int findend(int[] nums, int target){
        int start = 0, end = nums.length -1;
        while( start + 1 < end){
            int mid = (end - start) / 2 + start;
            if(nums[mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(nums[end] == target) return end;
        if(nums[start] == target) return start;
        return -1;
    }
}
