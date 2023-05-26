import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for(int i = 0; i < n; i += 2) {
            list2.add(list.get(i + 1));
            list2.add(list.get(i));
        }
        System.out.println(list2);
        sc.close();
    }
}
