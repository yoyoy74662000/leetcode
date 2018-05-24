/**
 *  You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

 Find out how many ways to assign symbols to make sum of integers equal to target S.

 Example 1:

 Input: nums is [1, 1, 1, 1, 1], S is 3.
 Output: 5
 Explanation:

 -1+1+1+1+1 = 3
 +1-1+1+1+1 = 3
 +1+1-1+1+1 = 3
 +1+1+1-1+1 = 3
 +1+1+1+1-1 = 3

 There are 5 ways to assign symbols to make the sum of nums be target 3.

 *
 */

// time: O(2^n) DFS
// space: O(n)

public class TargetSum {
    public int result = 0;

    public int findTargetSumWays(int[] nums, int S) {
        if(nums == null) {
            return 0;
        }

        dfsHelper(nums, 0, 0, S);
        return result;
    }

    public void dfsHelper(int[] nums, int pos, int curValue, int target) {
        if(pos == nums.length) {
            if(curValue == target){
                result++;
            }
            return;
        }
        dfsHelper(nums, pos + 1, curValue + nums[pos], target);
        dfsHelper(nums, pos + 1, curValue - nums[pos], target);
    }
}
