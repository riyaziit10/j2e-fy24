public class sol2 {
    static int getMaxWater(int []arr){
        int l=0, r=arr.length-1;
        int maxW = 0, minH=0;
        while(l<r){
            minH = Math.min(arr[l], arr[r]);
            maxW = Math.max(maxW, minH*(r-l));
            if(arr[l]<arr[r])   l++;
            else    r--;
        }
        return maxW;
    }
    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        // int []height = {1,1};

        System.out.println(getMaxWater(height));

    }
}
