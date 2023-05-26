import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<ArrayList<String>> ans = partition(s);
        System.out.println(ans);
    }
    public static ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        solve(s, 0, temp, ans);
        return ans;
    }
    public static void solve(String s, int start, ArrayList<String> temp, ArrayList<ArrayList<String>> ans) {
        if(start == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < s.length(); i++) {
            if(isPalindrome(s, start, i)) {
                temp.add(s.substring(start, i + 1));
                solve(s, i + 1, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
