import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int k = sc.nextInt();
        int count = 0;
        int i = 0;
        int j = 0;
        while(count < k) {
            if(i == 0 && j == 0) {
                count++;
                i++;
            }
            else if(i == 0 && j == 1) {
                count++;
                j++;
            }
            else if(i == 0 && j == 2) {
                count++;
                i++;
            }
            else if(i == 1 && j == 2) {
                count++;
                j--;
            }
            else if(i == 1 && j == 1) {
                count++;
                i++;
            }
            else if(i == 1 && j == 0) {
                count++;
                j++;
            }
            else if(i == 2 && j == 0) {
                count++;
                i--;
            }
            else if(i == 2 && j == 1) {
                count++;
                j++;
            }
            else if(i == 2 && j == 2) {
                count++;
                i--;
            }
        }
        System.out.println(matrix[i][j]);
    }
}
