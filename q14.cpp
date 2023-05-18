#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) 
    {
        int c,maxc;
        c=0;
        maxc=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==1)
            {
                c++;
                
            }
            else
                c=0;
            maxc=max(maxc,c);
        }
        return maxc;
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
    int result=s.findMaxConsecutiveOnes(nums);
    cout<<result;
    return 0;

}
