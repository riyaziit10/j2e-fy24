/*

Question 10: Reverse Bits

Reverse the bits of an 32 bit unsigned integer A.

Problem Constraints
0 <= A <= 2^32


Input Format
First and only argument of input contains an integer A.

Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.


Example Input
Input 1:
0
Output 1:
0
Explanation 1:
        00000000000000000000000000000000
=>      00000000000000000000000000000000



Input 2:
3
Output 2:
3221225472
Explanation 2:
        00000000000000000000000000000011    
=>      11000000000000000000000000000000

*/


import java.util.*;
public class Problem10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(reverseBits(x));
        sc.close();
    }
    public static long reverseBits(long x) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result |= (x & 1);
            x = x >> 1;
        }
        return result;
    }
}
