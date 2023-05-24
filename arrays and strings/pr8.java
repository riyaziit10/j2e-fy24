import java.util.*;
class pr8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            arr[i][j]=sc.nextInt();
        }
        int[][] ans=merge(arr);
        for(int i[]:ans){
            for(int j:i){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] currInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            
            if (interval[0] <= currInterval[1]) {
                currInterval[1] = Math.max(currInterval[1], interval[1]);
            } else {
                merged.add(currInterval);
                currInterval = interval;
            }
        }
        
        merged.add(currInterval);
        return merged.toArray(new int[merged.size()][]);
    }
}