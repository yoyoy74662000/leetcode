/**
 *  Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 Note:

 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.

 */

// time : O(n)
// space : O(n)

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return new int[]{};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> intersection = new ArrayList<>();

        for(int num : nums1){
            if(map.containsKey(num)){
                // map 可以覆蓋value
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num : nums2){
            if(map.containsKey(num)){
                if(map.get(num) > 0){
                    intersection.add(num);
                    map.put(num, map.get(num)-1);
                }
            }
        }
        int[] result = new int[intersection.size()];
        int k = 0;
        for(int num : intersection){
            result[k++] = num;
        }

        return result;
    }
}
