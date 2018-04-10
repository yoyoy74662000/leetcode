/**
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 * Your function should return length = 5,
 * with the first five elements of nums being 1, 1, 2, 2 and 3.
 * It doesn't matter what you leave beyond the new length.
 */

// time: O(n)
// space : O(1)


public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0, count = 0;
        while(i < nums.length){
            if(nums[i] != nums[j]){
                j = i;
            }if(i - j <=1 && nums[i] == nums[j]){
                nums[count] = nums[i];
                count++;
            }
            i++;
        }
        return count;
    }
}
