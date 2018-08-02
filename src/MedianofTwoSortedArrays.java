/**
 * time :O(m+n)
 * space :O(n)
 *
 *
 */
public class MedianofTwoSortedArrays {
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
