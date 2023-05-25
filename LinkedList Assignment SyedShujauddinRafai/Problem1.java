import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int num = sc.nextInt();
        list.remove(n - num);
        System.out.println(list);
        sc.close();
    }
}
