/**
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

 Example:
 Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

 Input: word1 = “coding”, word2 = “practice”
 Output: 3
 Input: word1 = "makes", word2 = "coding"
 Output: 1
 *
 *
 */
public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        int res = words.length;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                for(int j = 0; j < words.length; j++){
                    if(words[j].equals(word2)){
                        res = Math.min(res, Math.abs(i-j));
                    }
                }
            }
        }
        return res;
    }
}
