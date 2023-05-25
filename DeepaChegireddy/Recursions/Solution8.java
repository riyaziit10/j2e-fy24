import java.util.*;
public class Solution8 {
    public List<List<String>> partition(String s) {
        List<String>p=new ArrayList<>();
        List<List<String>>ll=new ArrayList<>();
    fun(0,s,p,ll);
    return ll;
 }
 public static void fun (int i,String s,List<String>p,List<List<String>>ll)
 {
     if(i==s.length())
     {
         ll.add(new ArrayList<>(p));
         return ;
     }
     for(int j=i;j<s.length();j++){
    if(pal(s,i,j))
    {
        p.add(s.substring(i,j+1));
    fun(j+1,s,p,ll);
    p.remove(p.size()-1);
    }
 }
 }
 public static boolean pal(String s,int st,int e){
 while(st<=e)
 {
     if(s.charAt(st++)!=s.charAt(e--)){
         return false;
     }
 }
     return true;
 }
}
