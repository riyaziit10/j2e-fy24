public class Problem14 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,0,1,1,1};
        int n=arr.length;
        int max=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c++;
            }
            max=Math.max(c,max);
            if(arr[i]==0){
                c=0;
            }
        }
        System.out.println(max);
    }
}
