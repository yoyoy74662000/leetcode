/**
 *  Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 For example,
 If n = 4 and k = 2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]

 *
 *
 *
 *
 */


// time: O(n)
// space: O(n)

public class Combinations {
    public List<List<Integer>> Combinations(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //List<Integer> list = new ArrayList<>();
        helper(res, new ArrayList<>(), n, k, 1);
        return res;
    }


    public void helper(List<List<Integer>> res, List<Integer> lists, int n, int k, int start) {
        if (k == 0) {
            res.add(new ArrayList<Integer>(lists));
            return;
        }
        for (int i = start; i <= n; i++) {
            lists.add(i);
            helper(res, lists, n, k - 1, i + 1);// k = 1, i = 2 k = 0, i = 3
            lists.remove(lists.size() - 1);
        }
    }
}

public class Combinations2 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(res, list, n, k, 1);
        return res;
    }

    public static void helper(List<List<Integer>> res, List<Integer> list, int n, int k, int start){
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i <= n; i++){
            if(list.contains(i)) continue;
            else{
                list.add(i);
            }
            helper(res, list, n, k, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
