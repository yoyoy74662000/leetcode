/**
 *  Given an unsorted array of integers, find the length of longest increasing subsequence.

 For example,
 Given [10, 9, 2, 5, 3, 7, 101, 18],
 The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4.
 Note that there may be more than one LIS combination, it is only necessary for you to return the length.

 Your algorithm should run in O(n2) complexity.

 Follow up: Could you improve it to O(n log n) time complexity?

 10 res = 0 i = 0 j = 0
 9 res = 1 i = 0 j = 0 mid = 0
 2 res = 1 i = 0 j = 0 mid = 0
 5 res = 1 i = 1 j = 1 mid = 0
 3 res = 2
 7 res = 2 i = 2 j = 2 mid = 1
 101 res = 3 i = 2 j = 3 mid = 1
 18 res = 4 i = 3 j = 3 mid = 3

 */

// time : O(nlogn)
// space : O(n)

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int[] tails = new int[nums.length];
        int res = 0;
        //[10, 9, 2, 5, 3, 7, 101, 18]
        for (int num : nums) {
            int i = 0, j = res;
            while (i != j) {
                int mid = (i + j) / 2;
                if (tails[mid] < num) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
            tails[i] = num;
            if (i == res) ++res;
        }
        return res;
    }
}
