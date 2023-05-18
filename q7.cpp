#include <iostream>
#include <vector>
#include <math.h>
#include <algorithm>
using namespace std;
using std::vector;
class Solution {
public:
    int maxSubArray(vector<int>& nums) 
    {
        int sum=0;
        int maxs=nums[0];
        for(int i=0;i<nums.size();i++)
        {
            sum+=nums[i];
            if(sum>maxs)
            {
                maxs=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
            
            
            
        }
        return maxs;
    }
};
int main()
{
    Solution s;
    int n,num;
    cout<<"enter no.";
    cin>>n;
    vector<int> nums;
    
    for(int i=0;i<n;i++)
    {
        cin>>num;
        nums.push_back(num);
    }
    
    int result=s.maxSubArray(nums);
    cout<<result;
    return 0;

}


