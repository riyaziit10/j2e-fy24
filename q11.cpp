#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int findPeakElement(vector<int>& nums) 
    {
        int a;
        int n=nums.size();
        int l=0,h=nums.size()-1;
        while(l<h)
        {
        int mid=(l+(h-l))/2;
        if(mid>0 && mid<n-1)
        {
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                a= mid;
            }
            else if(nums[mid]<nums[mid-1])
            {
                h=mid-1;
            }
            else if(nums[mid]<nums[mid+1])
            {
                l=mid+1;
            }
        }
        else if(mid==0)
        {
            if(nums[mid]>nums[mid+1])
            {
                a= 0;
            }
            
        }
        else if(mid==n-1)
        {
            if(nums[mid]>nums[mid-1])
            {
                a= n-1;
            } 
        }
        } 
        return a;
    }
};
int main()
{
    Solution s;
    int n,num;
    cout<<"enter no.";
    cin>>n;
    vector<int> prices;
    
    for(int i=0;i<n;i++)
    {
        cin>>num;
        prices.push_back(num);
    }
    int result=s.findPeakElement(nums);
    cout<<result;
    return 0;

}
