/**
 * Given an array with n objects colored red, white or blue,
 * sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */

// time : O(n)
// space : O(1)

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length ==0) return;
        int left = 0, right = nums.length -1, index = 0;
        while(index <= right){
            if (nums[index] == 1){
                index++;
            }else if (nums[index] == 0){
                swap(nums, index, left);
                index++;
                left++;
            }else{
                swap(nums, index, right);
                right--;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
