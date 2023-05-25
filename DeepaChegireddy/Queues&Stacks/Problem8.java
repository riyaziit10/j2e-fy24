import java.util.*;
public class Problem8 {
    public static String removeDup(String s) {
        StringBuilder se=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(se.length()>0 &&se.charAt(se.length()-1)== s.charAt(i))
            {
                se.deleteCharAt(se.length()-1);
            }
            else{
                se.append(s.charAt(i));
            }
        }
        return se.toString();
        
    }
    public static void main(String[] args) {
        System.out.println(removeDup("abbaca"));
    }
}
