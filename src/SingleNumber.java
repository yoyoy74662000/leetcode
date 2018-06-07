/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 *
 */


// time : O(n)
// space : O(1)


public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
        {
            // XOR 就是不相同為1 相同為 0 
            result ^= nums[i];
        }
        return result;
    }
}
