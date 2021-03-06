/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * [1,3,5,6] 5->2
 * [1,3,5,6] 2->1
 * [1,3,5,6] 7->4
 * [1,3,5,6] 0->0
 *
 */

// time : O(logn)
// space : O(1)
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums == null) return 0;
        int start = 0;
        int end = nums.length -1;
        // Binary Search 用法
        while(start + 1 < end){
            int mid = (end - start) / 2 + start;
            if(target == nums[mid]){
                return mid;
            }
            else if (target < nums[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }
        // 下面是如果target 不在array 裡面的做法
        //Input: [1,3,5,6], 2
        //Output: 1
        if(target <= nums[start]){
            return start;
        }
        //Input: [1,3,5,6], 7
        //Output: 4
        else if (target <= nums[end]){
            return end;
        }
        //Input: [1,3,5,6], 0
        //Output: 0
        else{
            return end +1;
        }
    }
}
