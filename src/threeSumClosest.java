/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number,
 * target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

// time:O(n^2)
// space: O(1)

public class threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int len = nums.length;
        int res = 0;
        if(len <= 3){
            for (int num : nums){
                res = res + num;
            }
            return res;
        }

        res = nums[0] + nums[1] + nums[2];
        for (int i = 0 ; i <= len -3; i++ ) {
            int left = i + 1;
            int right = len - 1;
            int sum = 0;
            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) <= Math.abs(target - res)) {
                    res = sum;
                    if (res == target) return res;
                }
                if(target > sum) left++;
                else if(target < sum) right--;
            }
        }
        return res;
    }
}

public class threeSumClosest2 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int start = i + 1, end = nums.length -1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum > target){
                    end--;
                }else{
                    start++;
                }
                if(Math.abs(target - sum) < Math.abs(target - res)){
                    res = sum;
                }

            }
        }
        return res;
    }
}