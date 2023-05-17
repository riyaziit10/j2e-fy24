/*
Problem 4:

Towers of Hanoi: In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of different sizes which can
slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on
top of an even larger one).

You have the following constraints:
(1) Only one disk can be moved at a time.
(2) A disk is slid off the top of one tower onto another tower.
(3) A disk cannot be placed on top of a smaller disk.

Write a program to move the disks from the first tower to the last and print the moves.


Example 1:
Input: N = 3
Output:
Move disk from rod 1 to rod 3
Move disk from rod 1 to rod 2
Move disk from rod 3 to rod 2
Move disk from rod 1 to rod 3
Move disk from rod 2 to rod 1
Move disk from rod 2 to rod 3
Move disk from rod 1 to rod 3


Constraints:
1 <= n <= 10

*/



import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solveHanoi(n, 1, 3, 2);
        sc.close();
    }

    public static void solveHanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println("Move disk from rod " + from + " to rod " + to);
            return;
        }
        solveHanoi(n-1, from, aux, to);
        System.out.println("Move disk from rod " + from + " to rod " + to);
        solveHanoi(n-1, aux, to, from);
    }
}

