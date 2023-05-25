import java.util.*;
public class Problem9 {
    List<Integer> list; int i;

    public Problem9() {
        list = new ArrayList<Integer>();
        i = 0;
    }
    
    public int next(int price) {
        list.add(i, price); 
        int j=i; int count = 0;
        while(list.get(j) <= price){
            if(j==0) {
                count++;
                break;
            }
            else{
                count++; 
                j--;
            }
        }
        i++;
        return count;
    }
    public static void main(String[] args) {
        Problem9 obj = new Problem9();
        System.out.println(obj.next(100));
        System.out.println(obj.next(80));
        System.out.println(obj.next(60));

    }
}
