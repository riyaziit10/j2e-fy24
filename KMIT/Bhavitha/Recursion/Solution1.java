/*
1. Print all possible strings of length k that can be formed from a set of n characters.
*/
static void printAllKLength(char[] set, int k)
{
    int n = set.length;
    printAllKLengthRec(set, "", n, k);
}
static void printAllKLengthRec(char[] set,String sub, int n, int k)
{
    if (k == 0)
    {
    System.out.println(sub);
    return;
    }
     for ( int i=0; i<n; ++i)
    {
    String newSub = sub + set[i];
    printAllKLengthRec(set, newSub, n, k - 1);
    }
}
