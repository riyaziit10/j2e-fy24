import java.util.*;
class Q1{
    public int nSteps(int N, int[] A) {
        Set<Integer> distinctWeights = new HashSet<>();
        for (int i = 0; i < N; i++) {
            distinctWeights.add(A[i]);
        }
        return distinctWeights.size();
    }

}