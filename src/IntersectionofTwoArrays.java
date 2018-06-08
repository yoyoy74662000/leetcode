import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * Given two arrays, write a function to compute their intersection.
 * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 */


// time : O(n) / O(nlogn)
// space : O(n) / O(n)

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return new int[]{};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int num : nums1){
            if(set.contains(num)){
                continue;
            }else{
                set.add(num);
            }
        }

        for(int num : nums2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int k = 0;
        for(int num : intersection){
            result[k++] = num;
        }

        return  result;
    }
}

public class IntersectionofTwoArrays2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new int[]{};
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums2);

        for(int num : nums1){
            if(binarysearch(nums2,num)){
                set.add(num);
            }

        }

        int[] result = new int[set.size()];
        int k = 0;
        for(int num : set){
            result[k++] = num;
        }

        return  result;

    }

    public static boolean binarysearch(int[] nums, int target){
        int start =0;
        int end = nums.length - 1;

        while(start + 1 < end){
            int mid = (end - start) / 2 + start;
            if(nums[mid] == target) return true;
            else if(nums[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }

        if(nums[start] == target || nums[end] == target) return true;
        return false;

    }

}