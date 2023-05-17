import java.util.*;

class problem12 {
    public static void main(String args[]) {
        int nums1[] = { 1, 2 };
        int nums2[] = { 3, 4 };
        System.out.println(find(nums1, nums2));
    }

    public static double find(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        if (merged.length % 2 == 0) {
            int mid = merged.length / 2;
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            int mid = merged.length / 2;
            return merged[mid];
        }
    }

}