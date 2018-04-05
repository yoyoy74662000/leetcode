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
