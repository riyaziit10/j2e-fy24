import java.util.*;
public class Problem6 {
    static List<List<Integer>> res = new ArrayList<>();
    static void backtrack(int[] arr, boolean[] visited, List<Integer> curr) {
        if (curr.size() == arr.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] || (i > 0 && arr[i] == arr[i-1] && !visited[i-1])) {
                continue;
            }
            visited[i] = true;
            curr.add(arr[i]);
            backtrack(arr, visited, curr);
            visited[i] = false;
            curr.remove(curr.size()-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        boolean[] visited = new boolean[arr.length];
        backtrack(arr, visited, new ArrayList<>());
        System.out.println(res);
        sc.close();
    }
}


