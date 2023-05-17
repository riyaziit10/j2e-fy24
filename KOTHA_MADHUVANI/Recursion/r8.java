import java.util.*;

public class r8 {
    public static void main(String[] args) {
        String s = "bcc";
        List<List<String>> partitions = partition(s);
        System.out.println(partitions);
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> currentPartition = new ArrayList<>();
        backtrack(result, currentPartition, s, 0);
        return result;
    }

    public static void backtrack(List<List<String>> result, List<String> currentPartition, String s, int startIndex) {
        if (startIndex == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            String substring = s.substring(startIndex, i + 1);
            if (isPalindrome(substring)) {
                currentPartition.add(substring);
                backtrack(result, currentPartition, s, i + 1);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
