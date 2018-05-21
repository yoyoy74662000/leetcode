/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Example:

 Input:  [1,2,3,4]
 Output: [24,12,8,6]

 Note: Please solve it without division and in O(n).

 我们以一个4个元素的数组为例，nums=[a1,a2,a3,a4]，要想在O(n)的时间内输出结果，比较好的解决方法是提前构造好两个数组：

 [1, a1, a1*a2, a1*a2*a3]
 [a2*a3*a4, a3*a4, a4, 1]

 然后两个数组一一对应相乘，即可得到最终结果 [a2*a3*a4, a1*a3*a4, a1*a2*a4, a1*a2*a3]。

 不过，上述方法的空间复杂度为O(n)，可以进一步优化成常数空间，即用一个整数代替第二个数组。
 *
 */

// time: O(n)
// space: O(n)


public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
