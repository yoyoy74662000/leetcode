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
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    //List<Integer> list = new ArrayList<>();
    helper(res, new ArrayList<>(), n , k, 1);
        return res;
}

    public void helper(List<List<Integer>> res, List<Integer> lists, int n, int k, int start){
        if(k == 0){
            res.add(new ArrayList<Integer>(lists));
            return;
        }
        for(int i = start; i <= n; i++){
            lists.add(i);
            helper(res, lists, n, k -1 , i + 1);
            lists.remove(lists.size() - 1);
        }
}
