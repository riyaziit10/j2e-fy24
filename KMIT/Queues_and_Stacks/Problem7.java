/*

PROBLEM 7:

GIVEN AN ARRAY, FIND THE NEXT GREATER ELEMENT (NGE) FOR EVERY ELEMENT IN THE ARRAY. THE
NEXT GREATER ELEMENT FOR AN ELEMENT X IS THE FIRST GREATER ELEMENT ON THE RIGHT SIDE OF X IN THE
ARRAY. IF THERE IS NO GREATER ELEMENT ON THE RIGHT SIDE, THEN THE OUTPUT FOR THAT ELEMENT SHOULD
BE -1.


Example input: [4, 5, 2, 25]
Expected output: [5, 25, 25, -1]


Example input: [13, 7, 6, 12]
Expected output: [-1, 12, 12, -1]

Expected Time Complexity: O(n), where n is the length of the input array
*/


import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = nextGreaterElement(arr);
        System.out.println(Arrays.toString(res));
        sc.close();
    }
    public static int[] nextGreaterElement(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }
        return res;
    }
}
