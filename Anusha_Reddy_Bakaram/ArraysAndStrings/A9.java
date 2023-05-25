class A9 {
    public void sortColors(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                swap(nums,i,a);
                a++;
            }
            
        }
        for(int i=a;i<nums.length;i++){
            if(nums[i]==1){
                swap(nums,i,a);
                a++;
            }
        }
    }
    public void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
}