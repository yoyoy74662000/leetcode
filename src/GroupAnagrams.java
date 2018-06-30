import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings, group anagrams together.
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 *
 * [
 * ["ate", "eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 *
 */

// time : O(m * nlogn)
// space : O(n)

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) return res;
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : strs ){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if (map.containsKey(s)){
                List<String> list = res.get(map.get(s)-1);
                // res.get 是指 get ArrayList index 位置
                list.add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                res.add(list);
                map.put(s,res.size());
            }
        }
        return res;

    }
}


public class GroupAnagrams2 {
    public List<List<String>> groupAnagrams(String[] strs) {

    }

}