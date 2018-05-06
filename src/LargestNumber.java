/**
 * Given a list of non negative integers, arrange them such that they form the largest number.

 Example 1:

 Input: [10,2]
 Output: "210"

 Example 2:

 Input: [3,30,34,5,9]
 Output: "9534330"
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return "";

        String[] res = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = String.valueOf(nums[i]);
        }
        // 下次要記住
        Arrays.sort(res, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);
            }
        });
        // char -> '' return String ""
        if(res[0].charAt(0) == '0') return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : res){
            sb.append(s);
        }
        return sb.toString();
    }
}
