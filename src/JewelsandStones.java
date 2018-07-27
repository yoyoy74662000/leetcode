public class JewelsandStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        for(char c : J.toCharArray()){
            set.add(c);
        }
        int ans = 0;
        for(char s : S.toCharArray()){
            if(set.contains(s)){
                ans++;
            }
        }
        return ans;
    }
}
