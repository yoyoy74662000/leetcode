/**
 *  Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.

 Example 1:

 Input: 5
 Output: True
 Explanation: 1 * 1 + 2 * 2 = 5

 Example 2:

 Input: 3
 Output: False

 *
 */
public class SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if(c == 0) return true;
        int left = 0, right = (int)Math.sqrt(c);
        while(left <= right){
            if((left*left + right*right) == c){
                return true;
            }else if((left*left + right*right) < c){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
