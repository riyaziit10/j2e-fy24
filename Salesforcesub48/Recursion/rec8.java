import java.util.*;

public class rec8 {
    public static List<List<String>> partitionPalindrome(String s) {
        List<List<String>> partitions = new ArrayList<>();
        partitionHelper(s, 0, new ArrayList<>(), partitions);
        return partitions;
    }

    private static void partitionHelper(String s, int start, List<String> current, List<List<String>> partitions) {
        if (start == s.length()) {
            partitions.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            String substring = s.substring(start, end + 1);
            if (isPalindrome(substring)) {
                current.add(substring);
                partitionHelper(s, end + 1, current, partitions);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.next();
        List<List<String>> partitions1 = partitionPalindrome(s1);
        System.out.println("Partitions for \"" + s1 + "\":");
        for (List<String> partition : partitions1) {
            System.out.println(partition);
        }
    }
}
