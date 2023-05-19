#include <iostream>
#include <vector>
using namespace std;
using std::vector;
class Solution {
public:
    int search(vector<int>& nums, int target) 
    {
        int low=0, high=nums.size()-1;
        while(low<=high) 
        {
            int mid=low+(high-low)/2;
            if(nums[mid] == target) 
            {
                return mid;
            }
            if(nums[low] <= nums[mid]) 
            {
                if(nums[low] <= target && nums[mid] >= target)
                    high = mid - 1;
                else low = mid + 1;
            }
            else 
            {
                if(nums[high] >= target && nums[mid] <= target)
                    low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
        
        
    }
};
int main()
{
    Solution s;
    int n,num,target;
    cout<<"enter no.";
    cin>>n;
    vector<int> nums;
    
    for(int i=0;i<n;i++)
    {
        cin>>num;
        nums.push_back(num);
    }
    cin>>target;
    int result=s.search(nums,target);
    cout<<result; 
    return 0;

}
