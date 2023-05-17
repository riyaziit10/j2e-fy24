/*
Question 9:

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them.


Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.


Example 2:
Input: x = 3, y = 1
Output: 1

*/


import java.util.*;
public class Problem9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hammingDist(a, b));
        sc.close();
    }
    public static int hammingDist(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while (xor > 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}
