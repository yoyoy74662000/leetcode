/**
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */


// time: O(n)
// space: O(1)

public class IntegertoRoman {
    public String intToRoman(int num) {
        if(num < 1 || num > 3999 ) return null;

        StringBuilder sb = new StringBuilder();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}

