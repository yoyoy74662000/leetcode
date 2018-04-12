/**
 *  Given a collection of integers that might contain duplicates, nums,
 *  return all possible subsets (the power set).
 *  Note: The solution set must not contain duplicate subsets.
 *  For example,
 *  If nums = [1,2,2], a solution is:
 *
 [
 [2],
 [1],
 [1,2,2],
 [2,2],
 [1,2],
 []
 ]
 */

// time: O(2^n)
// space: O(n)

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length ==0) return res;
        List<Integer> temp = new ArrayList<>();
        helper(res, temp, nums, 0);
        return res;
    }

    public static void helper(List<List<Integer>> res, List<Integer> list, int[]nums, int index){
        //List<Integer> temp = new ArrayList<>(list);
        res.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++){
            //HERE
            if(i != index && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            helper(res, list, nums, i+1);
            list.remove(list.size() -1);
        }
    }

}
