#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) 
    {
        priority_queue<int, vector<int>, greater<int>> h;
        int i;
        for(i=0;i<nums.size();i++)
        {
            h.push(nums[i]);
            if(h.size()>k)
            {
                h.pop();
            }
        }
        return h.top();      
    }
};
int main()
{
    Solution s;
    int n,num,k;
    cout<<"enter no.";
    cin>>n;
    vector<int> prices;
    
    for(int i=0;i<n;i++)
    {
        cin>>num;
        prices.push_back(num);
    }
    cin>>k;
    int result=s.findKthLargest(nums,k);
    cout<<result;
    return 0;

}
