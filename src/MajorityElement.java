import java.util.HashMap;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

// time :
// space :

// [1,2,2,3,3,3]
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums){
            if(! map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num) + 1);
            }
            if(map.get(num) > nums.length / 2){
                res = num;
                break;
            }
        }return res;
    }

}
