import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, s
 uch that there is a bijection between a letter in pattern and a non-empty word in str.

 Example 1:

 Input: pattern = "abba", str = "dog cat cat dog"
 Output: true
 Example 2:

 Input:pattern = "abba", str = "dog cat cat fish"
 Output: false
 Example 3:

 Input: pattern = "aaaa", str = "dog cat cat dog"
 Output: false
 Example 4:

 Input: pattern = "abba", str = "dog dog dog dog"
 Output: false
 Notes:
 You may assume pattern contains only lowercase letters,
 and str contains lowercase letters separated by a single space.
 *
 *
 */

// time : O(n)
// space : O(n)


public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> dict = new HashMap();
        Set<String> set = new HashSet();
        // pattern = "abba", str = "dog cat cat dog"
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            if (!dict.containsKey(c)) {
                if (!set.add(words[i])) {
                    return false;
                    //"abba"
                    //"dog dog dog dog"
                    // 第一次 add is true 第二次就是false
                }

                dict.put(c, words[i]);

                //當 i = 2 的時候 !dict.get(c).equals(words[i]) ＝ true 代表 hashmap 裡面沒有 word[i]
            } else if (!dict.get(c).equals(words[i])) {
                return false;
            }
        }

        return true;
    }
}
