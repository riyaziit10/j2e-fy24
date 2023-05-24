import java.util.*;
class pr1
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int maxCandies = 0;
        int extraCandies=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if (arr[i] > maxCandies) {
            maxCandies = arr[i];
            }
        }
        
        List<Boolean> result = new ArrayList<Boolean>();
        
        for (int candy : arr) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        System.out.println(result);
    }
}