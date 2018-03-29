import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 *
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 *
 *
 */

// time : O(n^2)
// space : O(n)

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            // 如果前後值一樣 就 下一個迴圈
            int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
            while (low < high){
                if (nums[low] + nums[high] == sum){
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while( low < high && nums[low]==nums[low + 1]) low ++;
                    while( low < high && nums[high]==nums[high - 1]) high--;
                    low ++;
                    high--;
                }
                else if (nums[low] + nums[high] < sum){
                    low++;
                }
                else {
                    high--;
                }
            }
        }
        return res;
    }
}
