import java.util.*;
public class A13{
public int maxWater(int n,int arr[]){
    int l=0;
    int r=n-1;
    int max=Integer.MIN_VALUE;
    while(l<r){
        int ht=Math.min(arr[l],arr[r]);
        int wd=r-l;
        max=Math.max(ht*wd,max);
        if(arr[l]<arr[r]){
            l++;
        }
        else{
            r--;
        }
    }
    return max;
}

}
