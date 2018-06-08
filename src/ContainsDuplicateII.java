import java.util.HashSet;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

 Example 1:

 Input: [1,2,1,3], k = 2
 Output: true

 Example 2:

 Input: [1,0,1,1], k = 1
 Output: true

 Example 3:

 Input: [1,2,1], k = 0
 Output: false

 */

// time: O(n)
// space: O(n)


public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}

public class ContainsDuplicateII2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (nums.length <= 1) return false;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)){
                return true;
            }else{
                map.put(nums[i], i);
            }
        }
        return false;
    }
}