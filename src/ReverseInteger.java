// time : O(n)
// space : O(1)
// 123->321

public class ReverseInteger {
    public int reverse(int x) {
        long res =0;
        while(x!=0){
            res = res*10 + x%10;
            x = x / 10;
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
        }
        return (int)res;
    }
}
