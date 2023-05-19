#include <iostream>
#include <vector>
using namespace std;
using std::vector;
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) 
    {
        sort(nums.begin(),nums.end());
        int diff;
        int calcu=INT_MAX;
        int ans;
        int i=0,j=nums.size()-1,k;
        k=i+1;
        while(k<j)
        {
            int sum=nums[i]+nums[k]+nums[j];
            int diff=abs(sum-target);
            if( diff<calcu )
                {
                    calcu = diff ;
                    ans = sum;
                }
                if( sum==target )
                {
                    return sum;
                }
                else if( sum<target )
                {
                    i++;
                    k++;
                }
                else
                {
                    j--;
                }
            } 
        
        return ans;

        
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

    int result=s.threeSumClosest(nums,target);
    
    
    cout << result <<endl;
    return 0;

}