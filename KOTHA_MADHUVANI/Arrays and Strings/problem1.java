import java.util.*;

class problem1 {
    public static void main(String args[]) {
        int candies1[] = { 2, 3, 5, 1, 3 };
        int extracandies1 = 3;
        int candies2[] = { 4, 2, 1, 1, 2 };
        int extracandies2 = 1;
        System.out.println(kids(candies1, extracandies1));
        System.out.println(kids(candies2, extracandies2));
    }

    public static List<Boolean> kids(int[] candies, int extraCandies) {
        // Find the maximum number of candies any kid has
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }

        // Create a result list to store whether each kid will have the greatest number
        // of candies
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            // Determine if the current kid will have the greatest number of candies after
            // receiving the extra candies
            result.add(candies[i] + extraCandies >= maxCandies);
        }

        // Return the result list
        return result;
    }

}