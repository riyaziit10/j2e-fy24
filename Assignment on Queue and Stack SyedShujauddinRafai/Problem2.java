import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        StackQueue g = new StackQueue();
        while(queries-->0){
            int choice = sc.nextInt();
            if(choice == 1){
                int x = sc.nextInt();
                g.push(x);
            }
            else if(choice == 2){
                System.out.print(g.pop()+" ");
            }
        }
        sc.close();
    }
}
class StackQueue{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    int pop(){
        if(s1.isEmpty()){
            return -1;
        }
        else{
            while(s1.size()!=1){
                s2.push(s1.pop());
            }
            int x = s1.pop();
            Stack<Integer> temp = s1;
            s1 = s2;
            s2 = temp;
            return x;
        }
    }
    void push(int a){
        s1.push(a);
    }
}
