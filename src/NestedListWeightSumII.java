/**
 * Given a nested list of integers, return the sum of all integers in the list weighted by their depth.

 Each element is either an integer, or a list -- whose elements may also be integers or other lists.

 Different from the previous question where weight is increasing from root to leaf, now the weight is defined from bottom up. i.e., the leaf level integers have weight 1, and the root level integers have the largest weight.

 Example 1:

 Input: [[1,1],2,[1,1]]
 Output: 8
 Explanation: Four 1's at depth 1, one 2 at depth 2.
 Example 2:

 Input: [1,[4,[6]]]
 Output: 17
 Explanation: One 1 at depth 3, one 4 at depth 2, and one 6 at depth 1; 1*3 + 4*2 + 6*1 = 17.
 *
 *
 */
public class NestedListWeightSumII {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        if(nestedList == null || nestedList.size() == 0) return 0;
        int h = helper(nestedList);
        return getSum(nestedList, h);
    }
    private int getSum(List<NestedInteger> nestedList, int layer) {
        if(nestedList == null || nestedList.size() == 0) return 0;
        int res = 0;
        for(NestedInteger nest : nestedList) {
            if(nest.isInteger()) {
                res = res + nest.getInteger() * layer;
            }
            else res = res + getSum(nest.getList(), layer - 1);
        }
        return res;
    }
    private int helper(List<NestedInteger> nestedList) {
        if(nestedList == null || nestedList.size() == 0) return 0;
        int max = 0;
        for(NestedInteger nest : nestedList){
            if(nest.isInteger()){
                max = Math.max(max,1);
            }else{
                max = Math.max(max, helper(nest.getList()) + 1);
            }
        }
        return max;
    }
}
