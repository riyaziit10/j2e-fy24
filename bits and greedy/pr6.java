import java.util.*;
public class pr6{
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
        if(nums.length<1){
            return 0;
        }
        int n = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                n = entry.getKey();
            }
        }
        return n;
    }
}