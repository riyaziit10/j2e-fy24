public class sol4 {
    static void getNextPermutation(int []arr){
        if(arr.length <= 1)    return;
        int i = arr.length - 2;
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
            if(i>=0){
                int j = arr.length - 1;
                while(arr[j] <= arr[i]) j--;                
                swap(arr, i, j);  
            }
        }
        reverse(arr, i+1, arr.length-1);
    }
    static void swap(int []arr, int a, int b){
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }
    static void reverse(int []arr,int i,int j){
        while(i<j){
            swap(arr, i++, j--);
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3};
        getNextPermutation(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
