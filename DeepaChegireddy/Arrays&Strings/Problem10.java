public class Problem10 {
    public static void main(String[] args) {
        //int[] arr = new int[]{7,1,5,3,6,4};
        //int[] arr = new int[]{1,2,3,4,5};
        int[] arr = new int[]{7,6,4,3,1};
        int sum = 0;
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i+1]>arr[i])
                    sum = sum + arr[i+1]-arr[i];
            }
            System.out.println(sum);
    }
}
