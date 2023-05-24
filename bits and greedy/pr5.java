import java.util.*;
public class pr5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> al=subsets(arr);
        System.out.println(al);

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        result.add(l);

        for(int n: nums){
            int resLen = result.size();
            
            for(int i=0;i<resLen;i++){
                List<Integer> list = result.get(i);

                List<Integer> newList = new ArrayList<>(list);
                newList.add(n);
                result.add(newList);
            }
            
        }
        return result;
    }
}