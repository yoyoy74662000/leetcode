/**
 *  Given a collection of candidate numbers (C) and a target number (T),
 *  find all unique combinations in C where the candidate numbers sums to T.
 *  Each number in C may only be used once in the combination.
 *  Note:
 *  All numbers (including target) will be positive integers.
 *  The solution set must not contain duplicate combinations.
 *  For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 *  A solution set is:                1,1,2,5,6,7,10
 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]
 */

// time: O()
// space : O(n)

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) return res;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res, list, candidates, target, 0);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> list, int[] candidates, int target, int start){
        if (target < 0) return;
        if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < candidates.length; i++){
            // 這裡就跟 combination sum 有差別
            //[1,1,2,5,6,7,10] 2
            if(i != start && candidates[i] == candidates[i - 1]) continue;
            list.add(candidates[i]);
            helper(res, list, candidates, target - candidates[i], i + 1);
            // [1,1]
            list.remove(list.size() -1 );
            // [1] -> [1,2] for迴圈 i++
        }
    }
}
