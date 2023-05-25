import java.util.*;

public class SubsetSums {
    public static void subsetSums(int[] arr) {
        List<Integer> subsets = new ArrayList<>();
        subsetSumsHelper(arr, 0, 0, subsets);
        for (int sum : subsets) {
            System.out.print(sum + " ");
        }
    }

    private static void subsetSumsHelper(int[] arr, int index, int currentSum, List<Integer> subsets) {
        if (index == arr.length) {
            subsets.add(currentSum);
            return;
        }

        subsetSumsHelper(arr, index + 1, currentSum + arr[index], subsets);
        subsetSumsHelper(arr, index + 1, currentSum, subsets);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subsetSums(arr);
        System.out.println();
    }
}
