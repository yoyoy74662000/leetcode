/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
// time : O(n)
// space : O(1)

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(res) != 0){
                res = res.substring(0, res.length-1);
            }
        }
        return res;
    }
}


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0, j = 0; i < first.length && j < last.length; i++, j++) {
            if (first[i] != last[j]) {
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }
}