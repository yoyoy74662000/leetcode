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
        helper(res, strs);
        return res;
    }
    public void helper(List<List<String>> res, String[] strs){
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String string = new String(c);
            if(map.containsKey(string)){
                res.get(map.get(string)-1).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                res.add(list);
                map.put(string, res.size());
            }
        }
    }
}


public class GroupAnagrams2 {
    public List<List<String>> groupAnagrams(String[] strs) {

    }

}