/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * x is guaranteed to be a non-negative integer.
 *
 * Input: 4
 * Output: 2
 *
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncated.
 *
 */

// time : O(logn)
// space : O(1)

public class Sqrtx {
        public int mySqrt(int x) {
            if(x <= 0) return 0;
            int low = 1;
            int high = x;
            while(low <= high){
                //注意long int
                long mid = (high - low) / 2 + low;
                if( mid * mid == x){
                    return (int)mid;
                }else if ( mid * mid < x){
                    low = (int)mid + 1;
                }else{
                    high = (int)mid -1;
                }
            }
            if( high * high < x){
                return high;
            }else{
                return low;
            }
        }
}
