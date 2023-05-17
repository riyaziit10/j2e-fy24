#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;


int maxSubArray(vector<int>& nums) {
        int n = nums.size();
 
        int maximumSum = INT32_MIN, currSumSubarray = 0;
        for (int i = 0; i < n; i++) {
            currSumSubarray += nums[i]; 
            maximumSum = max(maximumSum, currSumSubarray);
            //here we are taking max with 0 bcz if currSumSubarray = -1 or any negative value then it again starts with currSumSubarray = 0
            currSumSubarray = max(currSumSubarray, 0);
        } 
        return maximumSum;
}

int main()
{
    int n;
    cin>>n;
    vector<int>nums(n);
    for(int i = 0;i < n; i++)
       cin>>nums[i];
    cout << maxSubArray(nums);
}
