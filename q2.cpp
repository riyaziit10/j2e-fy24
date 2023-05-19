#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int maxArea(vector<int>& height) 
    {
        int s=0;
        int area=0;
        int e=height.size()-1;
        while(s<e)
        {
            int width=e-s;
            int h=min(height[s],height[e]);
            area=max((h*width),area);
            if(height[s]<=height[e])
            {
                s++;
            }
            else
            {
                e--;
            }

        }

        return area;

        
    }
};
int main()
{
    Solution s;
    int n,num;
    cout<<"enter no.";
    cin>>n;
    vector<int> height;
    
    for(int i=0;i<n;i++)
    {
        cin>>num;
        height.push_back(num);
    }
    
    int result=s.maxArea(height);
    
    
    cout << result <<endl;
    return 0;

}