/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * The replacement must be in-place, do not allocate extra memory.
 * Here are some examples.
 * Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1

 * // 1 2 7 4 3 1
        ^
 * // 1 2 7 4 3 1
              ^
 * // 1 3 7 4 2 1
        ^     ^
 * // 1 3 1 2 4 7
          ^ ^ ^ ^
 */

// time : O(n)
// space : O(1)

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int firstsmall = -1;
        // for 迴圈裡面的 i 要注意
        for (int i = nums.length - 2; i >= 0; i--){
            // 前面一位跟後面一位比較
            if (nums[i] < nums[i + 1]){
                firstsmall = i;
                break;
            }
        }

        if (firstsmall == -1){
            reverse(nums, 0, nums.length - 1);
            return;

        }

        int firstlarge = -1;
        // for 迴圈裡面的 i 要注意
        // i > firstsmall 就不會繼續跑到最前面
        for (int i = nums.length - 1 ; i > firstsmall; i--){
            if (nums[i] > nums[firstsmall]){
                firstlarge = i;
                break;
            }
        }
        swap(nums, firstsmall, firstlarge);
        reverse(nums, firstsmall + 1, nums.length - 1);
        return;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i++] = nums[j];
        nums[j--] = temp;
    }

    public static void reverse(int[] nums, int i, int j){
        while (i < j){
            swap(nums, i++, j--);
        }

    }
}
