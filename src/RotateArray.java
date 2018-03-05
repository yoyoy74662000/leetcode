/**
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */


// time : O(n) / O(n)
// space : O(n) / O(1)

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length -1; i++){
            temp[(i+k)%nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length -1; i++){
            nums[i] = temp[i];
        }
    }
}

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0 , nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}