/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 *
 *
 *
 */

// time : O(n) / O(n)
// space : O(1) / O(n)

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length ==0) return 0;
        int sum = nums[0];
        int res = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            sum = Math.max(nums[i], nums[i]+ sum);
            res = Math.max(res,sum);
        }
        return res;
    }
}


public class MaximumSubarray2 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length ==0) return 0;
        int[] dp = new int[nums.length];
        dp[0]= nums[0];
        int res = nums[0];
        for(int i = 0; i < nums.length ; i++){
            dp[i] = nums[i] + (dp[i-1] < 0 ? 0 : dp[i-1]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
