import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */

// time : O(n)
// space : O(n) becasue of hashmap

public class twosum {
    public int[] twoSum(int[] nums, int target) {
        //step 1
        //base case
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }
        int res[] = new int[]{-1, -1};
       Array.sort(nums);
        // step 3 hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            //step 2
            map.put(nums[i], i);
        }
        return res;


    }
}


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
