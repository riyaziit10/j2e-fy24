import java.util.*;
public class Problem12 {
    static double median(int arr1[],int arr2[],int m,int n) {
        int res[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(arr1[i]<arr2[j]) {
                res[k++] = arr1[i++];
            }
            else {
                res[k++] = arr2[j++];
            }
        }
        if(i<m) {
            while(i<m) 
                res[k++] = arr1[i++];
        }
        if(j<n) {
            while(j<n)
                res[k++] = arr2[j++];
        }
        n = n+m;
        if(n%2==1) 
            return res[((n+1)/2)-1];
        else return ((double)res[(n/2)-1]+(double)res[(n/2)])/2.0;
    }
    
    public static void main(String args[]) {
        int arr1[] = {1,2};
        int arr2[] = {2};
        int m=arr1.length;
        int n =arr2.length;
        System.out.printf("%.5f",median(arr1,arr2,m,n));
    }
}

