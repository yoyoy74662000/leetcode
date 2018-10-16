import java.util.ArrayList;

/**
 * Given a collection of distinct numbers, return all possible permutations.
 * For example,
 * [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 */

// time: O(n! * n)/ O(n)
// space: O(n)

public class permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        helper(res, list, nums);
        return res;
    }

    public static void helper(List<List<Integer>> res, List<Integer> list, int[] nums){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) continue; // 注意這邊就好
            else {
                list.add(nums[i]);
                helper(res, list, nums);
                list.remove(list.size() - 1);
            }
        }


    }
}

public class permutation2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        helper2(res, nums, 0);
        return res;
    }

    public static void helper2(List<List<Integer>> res, int[] nums, int start){
        if(start == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = start; i < nums.length; i++){
            swap(nums, start, i);
            helper2(res, nums, start + 1);
            swap(nums, start, i);
        }

    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}