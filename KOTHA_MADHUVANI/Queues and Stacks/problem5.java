import java.util.*;

public class problem5 {
    public static int[] cardDeckArrangement(int n) {
        // Initialize the deck with cards numbered from 1 to N
        int[] deck = new int[n];
        for (int i = 0; i < n; i++) {
            deck[i] = i + 1;
        }

        // Initialize variables to keep track of the current position
        // in the deck, the card to be picked, and the number of cards
        // that have been picked so far
        int pos = 0;
        int card = 1;
        int picked = 0;

        // Iterate until all cards have been picked
        while (picked < n) {
            // Pick the next card
            int next = (pos + card) % n;

            // Check if the card is the one we're looking for
            if (deck[next] == card) {
                // Add the card to the result array
                deck[next] = -1;
                picked++;
                if (picked == n) {
                    break;
                }

                // Move the remaining cards to the end of the deck
                for (int i = pos; i < n - 1; i++) {
                    deck[i] = deck[i + 1];
                }
                deck[n - 1] = -1;

                // Reset the position and the card to be picked
                pos = n - 1;
                card = 1;
            } else {
                // Move the card to the end of the deck
                int tmp = deck[next];
                for (int i = next; i < n - 1; i++) {
                    deck[i] = deck[i + 1];
                }
                deck[n - 1] = tmp;

                // Update the position and the card to be picked
                pos = next == n - 1 ? 0 : next;
                card++;
            }
        }

        // Build the result array
        int[] result = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (deck[i] != -1) {
                result[idx++] = deck[i];
            }
        }

        // Check if the arrangement is possible
        for (int i = 0; i < n - 1; i++) {
            if (result[i] > result[i + 1]) {
                return new int[] { -1 };
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = cardDeckArrangement(n);
        if (result[0] == -1) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(result[i]);
            }
        }
        sc.close();
    }
}
