/**
 * Given an array and a value, remove all instances of that value in-place and return the new length.
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 *
 */

// time : O(n)
// space : O(1)

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        if(A == null || A.length == 0) return 0;
        int idx = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[idx++] = A[i];
            }
        }
        return idx;
    }

}
