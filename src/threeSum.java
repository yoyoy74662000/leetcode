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
        Arrays.sort(nums); // [-1, -1, 0, 1, 2],
        for (int i = 0; i < nums.length - 2; i++){
            // i > 0 是因為 要從 i = 0 開始算
            if(i > 0 && nums[i] == nums[i-1]) continue;
            // 如果前後值一樣 就 下一個迴圈
            int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
            // sum = 0 - nums[i] 是最前面的值，low 是中間的值，high 是後面的值
            while (low < high){
                if (nums[low] + nums[high] == sum){
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    //while 迴圈是在說有沒有前後相同
                    // low 如果與後面一樣的話，在往後
                    while( low < high && nums[low]==nums[low + 1]) low ++;
                    // high 如果與前面一樣的話，在往前
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

public List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);        
        for(int i = 0; i < nums.length-2; i++){
            int left = i + 1;
            int right = nums.length -1;
            while(left < right){
                List<Integer> list = new ArrayList<>();
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    list.add(nums[i]);
                    list.add(nums[left++]);
                    list.add(nums[right--]);
                    res.add(list);
                }else if ( sum >0){
                    right--;
                 }else if (sum<0){
                    left++;
                  }
            }
        }
        return new ArrayList<>(res);
    }
