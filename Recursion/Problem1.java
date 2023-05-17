/*
Problem 1:

Print all possible strings of length k that can be formed from a set of n characters.


Example 1:
Input:
set[] = {'a', 'b'}, k = 3
Output:
aaa
aab
aba
abb
baa
bab
bba
bbb


Example 2:
Input:
set[] = {'a', 'b', 'c', 'd'}, k = 1
Output:
a
b
c
d


Constraints:
0 < n <= 10
0 < k <= 5

*/

import java.util.*;
class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ch = new char[n];
        for(int i=0; i<n; i++){
            ch[i] = sc.next().charAt(0);
        }
        int k = sc.nextInt();
        printAllStrings(ch, k);
        sc.close();
    }

    public static void printAllStrings(char[] set, int k) {
        int n = set.length;
        printAllStringsRec(set, "", n, k);
    }

    private static void printAllStringsRec(char[] set, String prefix, int n, int k) {
        if (prefix.length() == k) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; i++) {
            String newPrefix = prefix + set[i];
            printAllStringsRec(set, newPrefix, n, k);
        }
    }
}