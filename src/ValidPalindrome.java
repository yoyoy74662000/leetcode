/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 Note: For the purpose of this problem, we define empty string as valid palindrome.

 Example 1:

 Input: "A man, a plan, a canal: Panama"
 Output: true

 Example 2:

 Input: "race a car"
 Output: false
 */


// time: O(n)
// space: O(1)

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();
        int left = 0;
        int right = s.length() - 1;
        char cHead, cTail;
        while(left < right){
            cHead = s.charAt(left);
            cTail = s.charAt(right);
            if(!Character.isLetterOrDigit(cHead)) {
                left++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                right--;
            } else{
                if(cHead != cTail){
                    return false;
                }
                else{
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}
// ab:b:a