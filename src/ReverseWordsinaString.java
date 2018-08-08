/**
 * Given an input string, reverse the string word by word.

 Example:

 Input: "the sky is blue",
 Output: "blue is sky the".
 *
 *
 */

public class ReverseWordsinaString {
    if (s == null || s.length() == 0) return s;
    StringBuilder sb = new StringBuilder();
    String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >=0; i--) {
        sb.append(words[i] + " ");
    }
        return sb.toString().trim();
}
