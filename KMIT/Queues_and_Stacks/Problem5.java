/*
PROBLEM 5:

GIVEN A SORTED DECK OF CARDS NUMBERED 1 TO N.

1) We pick up 1 card and put it on the back of the deck.
2) Now, we pick up another card, it turns out to be card number 1, we put it outside the deck.
3) Now we pick up 2 cards and put it on the back of the deck.
4) Now, we pick up another card and it turns out to be card numbered 2, we put it outside the deck. ...
We perform this step until the last card.
If such an arrangement of decks is possible, output the arrangement, if it is not possible for a particular value of N then output
-1.


Example 1:
Input:
N = 4
Output: 2 1 4 3
Explanation:
We initially have [2 1 4 3]
In Step1, we move the first card to the end.
Deck now is: [1 4 3 2]
In Step2, we get 1. Hence we remove it. Deck
now is: [4 3 2]
In Step3, we move the 2 front cards ony by one 
to the end  ([4 3 2] -> [3 2 4] -> [2 4 3]).
Deck now is: [2 4 3]
In Step4, we get 2. Hence we remove it. Deck
now is: [4 3]
In Step5, the following sequence follows:
[4 3] -> [3 4] -> [4 3] -> [3 4]. Deck now
is: [3 4]
In Step6, we get 3. Hence we remove it. Deck
now is: [4] Finally, we're left with a single
card and thus, we stop. 


Example 2:
Input:
N = 5
Output: 3 1 4 5 2
Your Task:
Your task is to write a function which takes the integer N as input parameters and returns If such arrangement of decks is
possible, return the arrangement, if it is not possible for a particular value of n then return -1.
Expected Time Complexity: O(N^2)
Expected Auxiliary Space: O(1)*/



import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrangement = Cards(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arrangement[i] + " ");
        }
        sc.close();
    }
    public static int[] Cards(int n){
        int[] deck = new int[n];
        for (int i = 0; i < n; i++) {
            deck[i] = i + 1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(deck[i]);
        }
        int[] arrangement = new int[n];
        int i = 1, j = 0;
        while (!q.isEmpty()) {
            for (int k = 0; k < i; k++) {
                q.offer(q.poll());
            }
            arrangement[j++] = q.poll();
            i++;
        }
        for (int k = 0; k < n; k++) {
            if (arrangement[k] == 0) {
                return new int[]{-1};
            }
        }
        return arrangement;
    }
}
