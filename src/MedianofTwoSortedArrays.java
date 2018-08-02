/**
 * time :O(m+n) /Olog((m+n))
 * space :O(n)
 *
 *
 *
 */

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if(len % 2 == 1) {
            return (findKth(nums1, 0, nums2, 0, len / 2 + 1));
        }

        return (findKth(nums1, 0, nums2, 0, len / 2) + findKth(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
    }

    private static int findKth(int[] A, int A_start,
                               int[] B, int B_start,
                               int k) {
        if(A_start >= A.length) {
            return B[B_start + k - 1];
        }

        if(B_start >= B.length) {
            return A[A_start + k - 1];
        }

        if(k == 1) {
            return Math.min(A[A_start], B[B_start]);
        }

        int A_key = A_start + k / 2 - 1 < A.length ? A[A_start + k / 2 - 1] : Integer.MAX_VALUE;
        int B_key = B_start + k / 2 - 1 < B.length ? B[B_start + k / 2 - 1] : Integer.MAX_VALUE;

        if(A_key < B_key) {
            return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
        } else {
            return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
        }
    }
}

public class MedianofTwoSortedArrays2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, nums1Size = nums1.length;  //  setting pointer for first array
        int j = 0, nums2Size = nums2.length;    //  setting pointer for second array
        int total = nums1Size + nums2Size;   //  getting total elements in both arrays

        int mergeds1s2[] = new int[total];  //  new array to store sorted elemented
        int k=0;

        //  merging both arrays into mergeds1s2 to get the final sorted array
        while(i<nums1Size && j<nums2Size) {

            if(nums1[i] < nums2[j]) mergeds1s2[k] = nums1[i++];
            else mergeds1s2[k] = nums2[j++];
            k++;
        }

        if(i==nums1Size){
            while (j<nums2Size) mergeds1s2[k++] = nums2[j++];
        }
        else {
            while (i<nums1Size) mergeds1s2[k++] = nums1[i++];
        }

        //  returning the median.
        if(k%2 == 1) {
            return mergeds1s2[k/2];
        }
        else{
            return (mergeds1s2[k/2]+mergeds1s2[k/2 - 1])/2.0;
        }
    }
}
