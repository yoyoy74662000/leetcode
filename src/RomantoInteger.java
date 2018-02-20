/**
 * Given a roman numeral, convert it to an integer.
 *Input is guaranteed to be within the range from 1 to 3999.
 */

// time : O(n)
// space : O(1)

public class RomantoInteger {
    public int romanToInt(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int res = tonum(s.charAt(0));
        for(int i =1; i <=s.length() -1; i++){
            if( tonum(s.charAt(i))> tonum(s.charAt(i-1))){
                // important
                res = res + tonum(s.charAt(i)) - 2*tonum(s.charAt(i-1));
            }else{
                res = res + tonum(s.charAt(i));
            }
        }
        return res;
    }

    public static int tonum(char c){
        int res =0;
        switch (c){
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
        }
        return res;
    }
}
