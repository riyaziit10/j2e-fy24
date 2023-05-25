class A14{
    public int maxConsecutiveOnes(int[] nums) {
        int max=0;
        int cnt=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(cnt,max);
                cnt=0;
                continue;
            }
            cnt+=1;
        }
        return Math.max(cnt,max);
    }
}