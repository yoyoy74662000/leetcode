/**
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".
 *
 */

// time : O(n)
// space : O(n)

public class ReverseVowelsofaString {
    private HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    // hello
    public String reverseVowels(String s) {
        int l = 0, r = s.length()-1;
        char[] result = new char[s.length()];

        while(l <= r){
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if(!vowels.contains(cl)){
                result[l++] = cl;
            }else if(!vowels.contains(cr)){
                result[r--] = cr;
            }else{
                result[l++] = cr;
                result[r--] = cl;
            }
        }
        return new String(result);
    }
}
