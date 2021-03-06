import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 */

// time : O(n)
// space : O(n)

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i =0,j =0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }

            map.put(s.charAt(i), i);

            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}


// a -> ab -> b -> ba -> a -> ab -> abc
public class LongestSubstringWithoutRepeatingCharacters2 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
		HashSet<Character> set = new HashSet<>();
         if (s == null || s.length() == 0) return 0;
		for(int i = 0, j = 0; i < s.length();){
			if(set.contains(s.charAt(i))){
				set.remove(s.charAt(j++));
			}else{
				set.add(s.charAt(i));
                i++;
				res = Math.max(res, set.size());
			}
		}
		return res;
    }
}
