/**
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".
 *
 *
 */

// time : O(n)
// space : O(1)

public class ReverseString {
    public String reverseString(String s) {
        if(s == null || s.length() == 0) return"";
        return swap(s);
    }

    public String swap(String s){
        char[] str = s.toCharArray();
        for(int i = str.length -1; i >= str.length/2;i--){
            char temp = str[i];
            str[i] = str[str.length-i-1];     //前面變到後面
            str[str.length-i-1] = temp;       //後面變前面
        }
        return String.valueOf(str);
    }
}
