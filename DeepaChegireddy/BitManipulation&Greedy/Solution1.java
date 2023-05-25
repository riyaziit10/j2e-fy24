import java.util.*;
class Solution1 {
    public static int countSlices(int[] A) {
        HashSet<Integer> distinctWeights = new HashSet<>();

        for (int fruitWeight : A) {
            distinctWeights.add(fruitWeight);
        }

        return distinctWeights.size();
    }

}