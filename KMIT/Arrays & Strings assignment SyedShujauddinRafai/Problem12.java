import java.util.*;
public class Problem12 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int[] nums1 = new int[m];
    for (int i = 0; i < m; i++) {
        nums1[i] = sc.nextInt();
    }
    int n = sc.nextInt();
    int[] nums2 = new int[n];
    for (int i = 0; i < n; i++) {
        nums2[i] = sc.nextInt();
    }
    double median = findMedianSortedArrays(nums1, nums2);
    System.out.println("Median: " + median);
}
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length;
    int n = nums2.length;
    int[] nums = new int[m + n];
    int i = 0, j = 0, k = 0;
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
            nums[k++] = nums1[i++];
        }
        else {
            nums[k++] = nums2[j++];
        }
    }
    while (i < m) {
        nums[k++] = nums1[i++];
    }
    while (j < n) {
        nums[k++] = nums2[j++];
    }
    if ((m + n) % 2 == 0) {
        return (nums[(m + n)/2] + nums[(m + n)/2 - 1])/2.0;
    }
    else {
        return nums[(m + n)/2];
    }
}
}

}