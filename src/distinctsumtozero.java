public class distinctsumtozero {
    public static int[] sum(int N) {
        int[] ans = new int[N];
//		int idx = 0;
//		for(int i = 1; i <= N/2; i++) {
//			ans[idx++] = i;
//			ans[idx++] = -i;
//		}
        ans[0] = 0;
        int idx = 1;
        //基數
        if((N - 1) % 2 == 0) {
            for(int i = 1; i <= (N-1)/2; ++i) {
                ans[idx++] = i;
                ans[idx++] = -1 * i;
            }
            //偶數
        } else {
            ans[idx++] = 1;
            for(int i = 1; i <= (N -2)/2; ++i) {
                ans[idx++] = i + 1;
                ans[idx++] = -1 * (i);
//				ans[idx-1] = ans[idx-1] + (ans[idx-1] - (ans[idx-2]+ans[idx-1]));
            }
        }
        return ans;
    }
}
