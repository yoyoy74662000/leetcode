/**
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 *
 */

// time : O(n)
// space : O(1)

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        if(nums == null) return 0;
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }

}
