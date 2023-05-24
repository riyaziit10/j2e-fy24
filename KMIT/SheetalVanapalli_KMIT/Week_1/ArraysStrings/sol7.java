public class sol7 {
    static int getMaxSumSub(int []arr){
        int n=arr.length;
        int []sumdp = new int[n];
        int []maxdp = new int[n];
        sumdp[0]=maxdp[0]=arr[0];
        for(int i=1;i<n;i++){
            sumdp[i]= Math.max(sumdp[i-1]+arr[i],arr[i]);
            maxdp[i]=   Math.max(maxdp[i-1],sumdp[i]);
        }
        return maxdp[n-1];
    }
    public static void main(String[] args) {
        // int []arr={-2,1,-3,4,-1,2,1,-5,4};
        int []arr={5,4,-1,7,8};
        // int[]arr={-2,-1};
        System.out.println(getMaxSumSub(arr));
    }
}
