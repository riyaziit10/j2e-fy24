import java.util.*;
class A13 {
    public double medianSort(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+nums2.length];
        int j = 0;
        for (int i = 0;i<nums1.length;i++){
            ans[j]= nums1[i];
            j++;
        }
        for (int i = 0;i< nums2.length;i++){
            ans[j]=nums2[i];
            j++;
        }
        Arrays.sort(ans);
        int mid=(ans.length)/2;
        if(ans.length%2!=0)return (double)ans[mid];
        int a = ans[mid]+ans[mid-1];
        double x =(double)a/2;
        return x;
    }
}
