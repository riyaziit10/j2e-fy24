import java.util.*;
class rec1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] c=new char[n];
        for(int i=0;i<n;i++){
            c[i]=sc.next().charAt(0);
        }
        int k=sc.nextInt();
        printAllStrings(c,k);
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