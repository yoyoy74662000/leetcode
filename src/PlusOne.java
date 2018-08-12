/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 *
 */

// time : O(n)
// space : O(n) because of creating int[] at last

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) return null;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else {
                digits[i] = 0;
            }
        }

        int[] res = new int[digits.length + 1]; // [9,9,9]
        res[0] = 1;

        return res;
    }

}
