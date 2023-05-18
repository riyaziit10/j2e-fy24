#include <iostream>
#include <vector>
#include <math.h>
#include <algorithm>
using namespace std;
using std::vector;
class Solution {
public:
    void nextPermutation(vector<int>& nums) 
    {
        int n=nums.size();
        int second,first;
        int i,j;
        for(i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                
                break;
            }
        }
        if(i<0)
        {
            reverse(nums.begin(),nums.end());
        }
        else
        {
            for(j=n-1;j>i;j--)
            {
                if(nums[j]>nums[i])
                {
                   
                    break;
                }
            }
            swap(nums[i],nums[j]);
            reverse(nums.begin()+i+1,nums.end());
        }
        
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
    
    s.nextPermutation(nums);
    
    for(int i=0;i<n;i++)
    {
        cout<<nums[i];
    }
   
    return 0;

}
