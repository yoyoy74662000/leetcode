public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if (set.contains(beginWord)) {
            set.remove(beginWord);
        }
        Queue<String> queue = new LinkedList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put(beginWord, 1);
        queue.offer(beginWord);
        while (!queue.isEmpty()) {
            String word = queue.poll(); // hit
            int curLevel = map.get(word); // 1 長度
            for (int i = 0; i < word.length(); i++) {
                char[] wordUnit = word.toCharArray();
                for (char j = 'a'; j <= 'z'; j++) {
                    wordUnit[i] = j;
                    String nextWord = new String(wordUnit); // ait
                    if (set.contains(nextWord)) {
                        if (nextWord.equals(endWord)){
                            return curLevel + 1;
                        }
                        map.put(nextWord, curLevel + 1);
                        queue.offer(nextWord);
                        set.remove(nextWord);
                    }
                }
            }
        }
        return 0;
    }
}
