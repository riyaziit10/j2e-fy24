import java.util.*;
public class pr1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        Set<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}