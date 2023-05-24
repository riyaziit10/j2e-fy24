/*
Question 1: You are given N fruits. The weight of the fruits is represented by an array A. All those fruits which have the same weight can be sliced in one step. Task: Your task is to determine the number of steps to slice all the fruits. 
Example 1: Input: N = 4, A = [3, 6, 7, 7] 
Output: 3 
Example 2: Input: N = 6, A = [20, 40, 30, 50, 40, 20] 
Output: 4
*/
import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            int out_ = solve(N, A);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int solve(int N, int[] A){
        Set<Integer> s=new HashSet<>();
     for(int i=0;i<N;i++)
     {
        s.add(A[i]);
     }
    return s.size();
    }
}
