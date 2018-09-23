/**
 * Example:
 * Input: "Hello World"
 * Output: 5
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int index = s.lastIndexOf(" ") + 1;
        int length = s.substring(index, s.length()).length();
        return length;
    }
}

public class LengthofLastWord2 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if(arr == null || arr.length == 0) return 0;
        else{
            return arr[arr.length-1].length();
        }
    }
}