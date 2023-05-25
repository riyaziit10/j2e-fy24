import java.util.*;
public class Problem8 {
    public static int[][] mergeAll(int[][] arr) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        if (arr.length == 0) {
            return ans.toArray(new int[0][]);
        }

        int[] temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] <= temp[1]) {
                temp[1] = Math.max(temp[1], arr[i][1]);
            } else {
                ans.add(temp);
                temp = arr[i];
            }
        }
        ans.add(temp);

        return ans.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(mergeAll(arr)));
        
    }
}
