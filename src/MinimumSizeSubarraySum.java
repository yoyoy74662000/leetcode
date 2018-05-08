/**
 * Given an array of n positive integers and a positive integer s,
 * find the minimal length of a contiguous subarray of which the sum ≥ s.
 * If there isn't one, return 0 instead.
 * Example:
 *
 Input: [2,3,1,2,4,3], s = 7
 Output: 2
 Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 */

// time: O(n)
// space: O(1)

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int left = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(left <= i && sum >= s){
                res = Math.min(res, i-left+1);
                sum -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
