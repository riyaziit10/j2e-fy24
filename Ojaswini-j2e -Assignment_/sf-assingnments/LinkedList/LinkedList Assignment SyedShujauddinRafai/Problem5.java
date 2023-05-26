import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        LinkedList<Integer> list2 = new LinkedList<>();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        LinkedList<Integer> newHead = mergeInBetween(list1, a, b, list2);
        System.out.println(newHead);
    }
    public static LinkedList<Integer> mergeInBetween(LinkedList<Integer> list1, int a, int b, LinkedList<Integer> list2) {
        LinkedList<Integer> newHead = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            newHead.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            newHead.add(list2.get(i));
        }
        for (int i = b + 1; i < list1.size(); i++) {
            newHead.add(list1.get(i));
        }
        return newHead;
    }
}
