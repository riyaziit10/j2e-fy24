import java.util.*;

public class Problem11 {
    public static int findPeakElement(int[] arr) {
        if (arr.length==1|| arr.length==0)
            return 0;
        int lo = 0 ,hi = arr.length-1;
        while(lo<=hi){
            int m = lo+(hi-lo)/2;
            if (m>0 && m<arr.length-1){
                if (arr[m]>arr[m-1] && arr[m]>arr[m+1])
                    return m;
                else if (arr[m-1]<arr[m])
                    lo = m +1;
                else    
                    hi = m-1;
            
            }
            if (m==0){
                if (arr[m]<arr[m+1])
                    return m+1;
                return m;
            }
            if (m==arr.length-1){
                if (arr[m]>arr[m-1])
                    return m;
                return m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int[] arr = new int[]{1,2,3,1};
        int[] arr = new int[]{1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
}
