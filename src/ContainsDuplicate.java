import java.util.HashMap;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 *
 */


// time : O(n)
// space : O(n)

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if(! map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num) + 1);
            }
            if(map.get(num) >=  2){
                return true;
            }
        }return false;
    }
}


public class ContainsDuplicate2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(!set.add(i))// [1,2,2] 當set.add(1) is true but there is ! so it is not true. Go to next nums[]
                return true;
        }
        return false;
    }
}

public class ContainsDuplicate3 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }

            if(map.get(nums[i]) >= 2){
                return true;
            }
        }
        return false;
    }
}