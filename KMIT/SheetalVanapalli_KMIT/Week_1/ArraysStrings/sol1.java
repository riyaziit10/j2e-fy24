import java.util.Arrays;

/**
 * sol1
 */
public class sol1 {
    static boolean[] getMaxCandies(int []arr, int extra){
        boolean []res = new boolean[arr.length];
        int max = Arrays.stream(arr).max().getAsInt();
        int i=0;
        for(int c:arr){
            if(c+extra >= max){
                res[i] = true;
            }
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        // int []candies1 = {2,3,5,1,3};
        // int extracandies = 3;
        int []candies2 = {4,2,1,1,2};
        int extracandies2 = 1;
        boolean []res = new boolean[candies2.length];
        // res = getMaxCandies(candies1, extracandies);
        res = getMaxCandies(candies2, extracandies2);
        for (boolean b : res) {
            System.out.print(b+" ");
        }
    }
}