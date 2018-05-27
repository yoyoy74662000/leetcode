/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear
 * twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the
 returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]
 *
 *
 */

// time: O(n)
// space: O(n)


public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        // 這個for 迴圈是把數值標記回negative
  for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }
}

public class FindAllNumbersDisappearedinanArray2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            while(nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]){
                swap(nums, i, nums[i] - 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1)
                result.add(i + 1);
        }
        return result;
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}