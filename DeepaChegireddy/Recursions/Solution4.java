import java.util.*;
public class Solution4 {
    void solve(int n, int src, int des, int helper){
        if(n==1){
            System.out.println("Moving disc 1 from "+des);
        return;
        }
        solve(n-1, src, helper, des);
        System.out.println("Moving disc "+n+" from "+1+" to "+des);
        solve(n-1, helper, des, src);
        return;
        }
}
