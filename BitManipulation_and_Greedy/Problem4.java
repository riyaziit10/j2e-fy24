/*

Question 4:

You have N pills of characteristic values [a1, a2…..an]
On each day i, you can take the ith pill and increase your health by ai points or Do nothing and take 1 point of
damage
H = H - 1, where H is a value denoting your health.
You die if your health becomes zero. Initially H = V (where V is a value given in the input).
What is the minimum number of pills you should take to survive for N days.


Example 1:
Input: N = 5, V = 1, a = [1,1,1,1,1]
Output: 3
Explanation
In this case, you would need to eat the 1st, 3rd and 5th pills to survive.


Example 2:
Input: N = 5, V = 2, a = [1,3,1,1,3]
Output: 2

*/


import java.util.*;
public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minPills(n, v, arr));
        sc.close();
    }
    public static int minPills(int N, int V, int[] a) {
        int pills = 0;
        int health = V;
        for (int i = 0; i < N; i++) {
            if (health <= 0) {
                break; 
            } 
            else if (a[i] >= health) {
                pills++;
                health = health + a[i];
            } 
            else {
                health--;
            }
        }
        return pills;
    }
}