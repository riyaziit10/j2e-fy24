import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n2 = sc.nextInt();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }
        LinkedList<Integer> result = merge(list1, a, b, list2);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
    public static LinkedList<Integer> merge(LinkedList<Integer> list1, int a, int b, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            result.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            result.add(list2.get(i));
        }
        for (int i = b + 1; i < list1.size(); i++) {
            result.add(list1.get(i));
        }
        return result;
    }
}
