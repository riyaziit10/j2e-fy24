import java.util.*;
class pr4
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solve(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void solve(int[] A) {
        if(A == null || A.length <= 1) return;
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i + 1]) i--; 
        if(i >= 0) {  
            int j = A.length - 1;  
            while(A[j] <= A[i]) j--;     
            swap(A, i, j);    
            }
        reverse(A, i + 1, A.length - 1);    
    }

    public static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public static void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }
    
}