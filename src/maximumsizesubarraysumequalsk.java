public class maximumsizesubarraysumequalsk {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = { 2, 5, 1, 6, 7, 9 };
        int k = 9;
        System.out.println(maxSubArrayLen2(nums, k));
    }

    public static int maxSubArrayLen(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int max = 0;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                max = Math.max(max, i + 1);
            }

            int diff = sum - k;

            if (map.containsKey(diff)) {
                max = Math.max(max, i - map.get(diff));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return max;
    }

    public static int maxSubArrayLen2(int[] nums, int k) {
        int sum = 0, count = 0, ans = 0;
        //{ 2, 5, 1, 6, 7, 9 };
        for (int i = 0; i < nums.length; i++) {
            if ((sum + nums[i]) <= k) {
                sum = sum + nums[i];
                count++;
            } else if (sum != 0) {
                sum = sum - nums[i - count] + nums[i];
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
