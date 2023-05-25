import java.util.*;
public class pr9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(solve(x,y));
    }
    public static int solve(int x,int y){
        int ct=0;
        int xb=0,yb=0;
        while(x>0 || y>0){
            xb=x%2;
            yb=y%2;
            x=x/2;
            y=y/2;
            if(xb!=yb){
                ct++;
            }
        }
        return ct;

    }
}