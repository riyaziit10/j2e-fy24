public class Q3 {
    public int Eat(int n, int[] a) {
        int minCandies = Integer.MAX_VALUE;
        int totalCandies = 0;
    
        for (int i = 0; i < n; i++) {
            minCandies = Math.min(minCandies, a[i]);
            totalCandies += a[i];
        }
    
        int minCandiesToEat = totalCandies-minCandies*n;
    
        return minCandiesToEat;
    }
    
}
