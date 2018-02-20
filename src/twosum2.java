/**
 * Given an array of integers, find two numbers such that they add up to a specific target
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */

// 暴力解法

public class twosum2 {
    public int[] twoSum(int[] nums, int target) {
        int lengths = nums.length;
        int result[] = new int[2];
        for (int i = 0; i < lengths; i++) {
            for (int j = 1; j < lengths; j++) {
                if (nums[i] + nums[j] == target && i < j) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

