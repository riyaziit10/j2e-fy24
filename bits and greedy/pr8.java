import java.util.*;
public class pr8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(fun(arr));
    }
        public static int fun(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Integer e:hm.keySet()){
            if(hm.get(e)==1){
                return e;
            }
            
        }
        return -1;
    }
}