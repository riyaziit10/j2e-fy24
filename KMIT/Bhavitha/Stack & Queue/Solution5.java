/*
5. GIVEN A SORTED DECK OF CARDS NUMBERED 1 TO N.
1) We pick up 1 card and put it on the back of the deck.
2) Now, we pick up another card, it turns out to be card number 1, we put it outside the deck.
3) Now we pick up 2 cards and put them on the back of the deck.
4) Now, we pick up another card and it turns out to be card numbered 2, we put it outside the
deck. ... We perform this step until the last card. If such an arrangement of decks is possible,
output the arrangement, if it is not possible for a particular value of N then output -1.
*/
class Solution{
ArrayList<Integer> rotation(int n) {
Deque<Integer> dq = new ArrayDeque<>();
for (int i = n; i >= 1; i--) {
dq.offerFirst(i);
for (int j = 0; j < i; j++) {
dq.offerFirst(dq.pollLast());
}
}
ArrayList<Integer> list = new ArrayList<>();
while (dq.peekFirst() != null) {
list.add(dq.pollFirst());
} return list;
}
}