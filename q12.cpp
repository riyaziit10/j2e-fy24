#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> num3;
        float median;
        int n = nums1.size();
        int m = nums2.size(); 

        for(int i=0;i<n;i++)
        {
            num3.push_back(nums1[i]);
        } 
        for(int j=0;j<m;j++)
        {
            num3.push_back(nums2[j]);
        } 
        sort(num3.begin(),num3.end());
        if((n+m)%2==0)
        {
            median = (float)(num3[(int)(m+n)/2]+num3[(int)(m+n)/2-1])/2;
        }
        else if((n+m)%2!=0)
        {
            median = (float)num3[(int)(m+n-1)/2];
        }

            return median;
        
    }
};
int main() {
    Solution s;
    int n1,n2,num1,num2;
    cout<<"enter no.";
    cin>>n1;
    vector<int> nums1;
    
    for(int i=0;i<n1;i++)
    {
        cin>>num1;
        nums1.push_back(num1);
    }
    cout<<"enter no.";
    cin>>n2;
    vector<int> nums2;
    
    for(int i=0;i<n2;i++)
    {
        cin>>num2;
        nums2.push_back(num2);
    }
    double result=s.findMedianSortedArrays(nums1,nums2);
    cout<<result;
    return 0;
}