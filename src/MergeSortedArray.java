/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * Example:

 Input:
 nums1 = [1,2,3,0,0,0], m = 3
 nums2 = [2,5,6],       n = 3

 Output: [1,2,2,3,5,6]
 */

// time : O(m + n)
// space : O(1)
// 需要从尾开始遍历，否则在 nums1 上归并得到的值会覆盖还未进行归并比较的值

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n -1;
        int k = m + n -1;
        while(i >=0 && j >= 0){
            if(nums1[i] > nums2[j]) // 從最後一個看
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
            //如果j < 0 的時候，就代表前面都排好了
        }
        //這個是當num1 > num2
        //num1 [4,5,6]
        //num2 [1,2,3]
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
