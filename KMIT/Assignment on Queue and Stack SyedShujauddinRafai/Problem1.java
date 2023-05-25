import java.util.*;
import java.io.*;
import java.lang.*;
public class Problem1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int queries = Integer.parseInt(br.readLine().trim());
        StackQueue g = new StackQueue();
        while(queries-->0){
            String[] str = br.readLine().trim().split(" ");
            if(str[0].equals("push")){
                int x = Integer.parseInt(str[1]);
                g.push(x);
            }
            else if(str[0].equals("pop")){
                System.out.print(g.pop()+" ");
            }
        }
    }
}
class StackQueue{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        else{
            while(q1.size()!=1){
                q2.add(q1.remove());
            }
            int x = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return x;
        }
    }
    void push(int a){
        q1.add(a);
    }
}