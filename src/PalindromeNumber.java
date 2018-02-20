// time : O(n)
// space : O(1)
// PalindromeNumber 12321 121 22 44
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        //corner case
        // example 1000
        // 0->0->0->1
        // 1 cant compare woth 1000
        if(x < 0 || x !=0 && x % 10 == 0){
            return false;
        }
        int rev =0;
        int palind =x;
        while(x != 0){
            rev = rev*10 + x % 10;
            x = x /10;
        }
        return palind == rev;
    }
}
