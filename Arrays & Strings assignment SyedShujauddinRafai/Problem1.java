public class Problem1 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] result = new boolean[candies.length];
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result[i] = true;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
