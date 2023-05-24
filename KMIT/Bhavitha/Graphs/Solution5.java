/*
5. Implement a function to find the kth smallest element in a matrix, where the matrix is sorted row-wise and columnwise.
 Example: Input: matrix = [[1,5,9], [10,11,13], [12,13,15]] k = 8 Output: 13
 */
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                map.put(matrix[i][j], map.getOrDefault(matrix[i][j], 0) + 1);
            }
        }

        for(int n : map.keySet()) {
            k -= map.get(n);

            if(k <= 0) {
                return n;
            }
        }

        return -1;
    }
}

