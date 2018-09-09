public class solution {
    public static void main(String[] args) {
        int[] array = {4,5,6,1,2,3};
        System.out.println(findMin(array));
    }

    public static int findMin(int[] nums) {
        if(nums.length == 0) return -1;
        int start = 0;
        int end = nums.length -1;
        while(start + 1 < end){
            int mid = (end - start) / 2 + start;
            if(nums[start] > nums[mid]){
                end = mid;
            }else{ // [1,3,3] 類似有重複
                start = mid;
            }
        }
        if(nums[start] > nums[end]) return nums[start];
        else return nums[end];
    }
}
