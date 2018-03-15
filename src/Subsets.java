import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 * If nums = [1,2,3], a solution is:
 * [
    [3],
    [1],
    [2],
    [1,2,3],
    [1,3],
    [2,3],
    [1,2],
    []
   ]
 *
 *
 *
 */


// time : O(2^n)
// space : O(n)

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length ==0) return res;
        List<Integer> list = new ArrayList<>();
        helper(res, list, nums, 0);
        return res;
    }

    public static void helper(List<List<Integer>> res, List<Integer> list, int[]nums, int index){
        List<Integer> temp = new ArrayList<>(list);
        res.add(temp);
        for (int i = index; i < nums.length; i++){
            list.add(nums[i]);
            helper(res, list, nums, i+1);
            list.remove(list.size() -1);
        }
    }
}
