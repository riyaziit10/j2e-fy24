public class sol14 {
    static int maxConsecutiveOnes(int []arr){
        int i=0,c=1,max=0;
        while(i<arr.length-1){
            if(arr[i]==1 && arr[i+1]==1){
                c++;
                max = Math.max(max,c);
            }
            else{
                c=1;
            }
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr={1,1,0,1,1,1} ;
        System.out.println(maxConsecutiveOnes(arr)); 
    }
}
