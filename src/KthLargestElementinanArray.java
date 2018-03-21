import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Find the kth largest element in an unsorted array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * For example,
 * Given [3,2,1,5,6,4] and k = 2, return 5.
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */

// time : O(n) / O(nlogk)
// space : O(1) / O(1)

public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0, right = nums.length -1;
        while (true){
            int pos = partition(nums, left, right);
            if(pos + 1 == k){
                return nums[pos];
            }else if(pos + 1 > k){
                right = pos - 1;
            }else{
                left = pos + 1;
            }
        }
    }
    public int partition(int[] nums, int left, int right){
        int pivot = nums[left];
        int l = left + 1;
        int r = right;
        while(l <= r){
            if (nums[l] < pivot && nums[r] > pivot){
                swap(nums, l++, r--);
            }
            if (nums[l] >= pivot) return l++;
            if (nums[r] <= pivot) return r--;
        }
        swap(nums, left, r);
        return r;
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right]= temp;
    }

}


public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int num : nums){
            minheap.offer(num);
            if (minheap.size() > k){
                minheap.poll();
            }
        }
        return minheap.poll();
    }
}
