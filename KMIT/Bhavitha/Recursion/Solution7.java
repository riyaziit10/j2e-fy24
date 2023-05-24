/*
7. 0/1 Knapsack Problem: We are given N items where each item has some weight and profit
associated with it. We are also given a bag with capacity W, [i.e., the bag can hold at most W
weight in it]. The target is to put the items into the bag such that the sum of profits associated
with them is the maximum possible. The constraint here is we can either put an item completely
into the bag or cannot put it at all [It is not possible to put a part of an item into the bag].
*/
class Knapsack {
static int max(int a, int b) { return (a > b) ? a : b; }
static int knapSack(int W, int wt[], int val[], int n)
{
if (n == 0 || W == 0)
return 0;
if (wt[n - 1] > W)
return knapSack(W, wt, val, n - 1);
else
return max(val[n - 1]
+ knapSack(W - wt[n - 1], wt,
val, n - 1),
knapSack(W, wt, val, n - 1));
}