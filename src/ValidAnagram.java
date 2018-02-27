import java.util.Arrays;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example, s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 *
 *
 *
 */

// time : O(nlogn)/ O(n)
// space : O(n)/ O(n)

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return null;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1,str2);
    }
}

public class ValidAnagram2 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for(int i =0; i < s.length() - 1;i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int num : count){
            if(num != 0) {
                return false;
            }
        }
        return true;
    }
}