import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList<Integer> list2 = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
        LinkedList<Integer> list3 = new LinkedList<>();
        int i = 0, j = 0;
        while(i < n && j < m) {
            if(list1.get(i) < list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            }
            else {
                list3.add(list2.get(j));
                j++;
            }
        }
        while(i < n) {
            list3.add(list1.get(i));
            i++;
        }
        while(j < m) {
            list3.add(list2.get(j));
            j++;
        }
        System.out.println(list3);
    }
}
