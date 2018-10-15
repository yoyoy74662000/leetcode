/**
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
 Example 1:
 Input:s1 = "ab" s2 = "eidbaooo"
 Output:True
 Explanation: s2 contains one permutation of s1 ("ba").
 Example 2:
 Input:s1= "ab" s2 = "eidboaoo"
 Output: False
 *
 *
 */
public class PermutationinString {
    public static boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        int[] f1 = new int[26];
        for (int i = 0; i < n1; i++)
            f1[s1.charAt(i) - 'a']++;
        // s1 = "ab" s2 = "eba"
        int[] f2 = new int[26];
        for (int j = 0; j < n2; j++) {
            f2[s2.charAt(j) - 'a']++;
            if (j >= n1)
                f2[s2.charAt(j - n1) - 'a']--;
            if (Arrays.equals(f2, f1))
                return true;
        }
        return false;
    }
}
