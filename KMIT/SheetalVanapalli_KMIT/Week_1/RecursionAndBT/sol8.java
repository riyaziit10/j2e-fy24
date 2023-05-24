import java.util.*;
public class sol8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(partition(s));
        sc.close();
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<String>(), result);
        return result;
    }

    private static void backtrack(String s, int start, List<String> temp, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<String>(temp));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    temp.add(s.substring(start, i + 1));
                    backtrack(s, i + 1, temp, result);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }

    private static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
}