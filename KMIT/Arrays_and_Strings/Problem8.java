/*

Problem 8:

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an
array of the non-overlapping intervals that cover all the intervals in the input.


Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].


Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */


import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starti = sc.nextInt();
        int endi = sc.nextInt();
        int[][] intervals = new int[starti][endi];
        for(int i=0; i<starti; i++){
            for(int j=0; j<endi; j++){
                intervals[i][j] = sc.nextInt();
            }
        }
        int[][] mergedIntervals = merge(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        sc.close();
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));  
        List<int[]> merged = new ArrayList<>();
        int[] currInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currInterval[1]) {  
                currInterval[1] = Math.max(currInterval[1], intervals[i][1]);
            } else {  
                merged.add(currInterval);
                currInterval = intervals[i];
            }
        }
        merged.add(currInterval);  
        return merged.toArray(new int[merged.size()][]);
    }
}


