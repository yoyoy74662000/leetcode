/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

 Note: Do not use any built-in library function such as sqrt.

 Example 1:

 Input: 16
 Returns: True
 Example 2:

 Input: 14
 Returns: False

 */

// time : O(n)
// space : O(1)

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num <= 0) return false;
        int low = 1;
        int high = num;
        while(low <= high){
            long mid = (high - low) / 2 + low;
            if(mid * mid == num){
                return true;
            }else if ( mid * mid < num){
                low = (int)mid + 1;
            }else{
                high = (int)mid -1;
            }
        }


        return false;
    }
}
