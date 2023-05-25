import java.util.*;

class R1{
    static List<String> print(char[] arr, int k)
    {
        int n = arr.length;
        List<String>ls=new ArrayList<>();
        rec(arr, "", n, k,ls);
        return ls;
    }
    static void rec(char[] arr,String res,int n, int k,List<String>ls)
    {
        if (k == 0)
        {
            ls.add(res);
            res="";
            return;
        }
        for (int i = 0; i < n; ++i)
        {
           
            rec(arr, res+arr[i],n, k - 1,ls);
        }
    }
}