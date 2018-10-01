/**
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

 word1 and word2 may be the same and they represent two individual words in the list.

 Example:
 Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

 Input: word1 = “makes”, word2 = “coding”
 Output: 1
 Input: word1 = "makes", word2 = "makes"
 Output: 3
 *
 */
public class ShortestWordDistanceIII {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int a = -1, b = -1;
        int res = words.length;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                a = i;
            }
            if(words[i].equals(word2)){
                if(word1.equals(word2)){
                    a = b;
                }
                b = i;
            }
            if(a != -1 && b != -1){
                res = Math.min(res, Math.abs(a-b));
            }
        }
        return res;
    }
}
