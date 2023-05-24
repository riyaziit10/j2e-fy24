import java.util.*;
public class pr10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev = 0;
        while (n > 0) {
            rev <<= 1;
            if ((int)(n & 1) == 1)
                rev ^= 1;
            n >>= 1;
        }
        System.out.println(rev);
        
    }
}