/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 *
 *  1         3     3      2      1
 *   \       /     /      / \      \
 *    3     2     1      1   3      2
 *   /     /       \                 \
 *  2     1         2                 3
 *
 *       1             2                       3
        / \           / \                    /  \
      0  2 3         1   3                 1 2  0
 count(0) count(2)  count(1) count(1)  count(2) count(0)
 */


// time : O(n^2)
// space : O(1)

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] count = new int[n + 1];
        count[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                count[i] += count[j] * count[i - j - 1];
            }
        }
        return count[n];
    }
}
