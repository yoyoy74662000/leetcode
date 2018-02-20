// 暴力解法
public class twosum2 {

    int lengths = nums.length;
    int result[] = new int[2];
        for (int i = 0; i < lengths; i++) {
        for (int j = 1; j < lengths; j++) {
            if (nums[i] + nums[j] == target && i < j) {
                result[0] = i;
                result[1] = j;
            }
        }
    }
        return result;
}

}
