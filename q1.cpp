#include <iostream>
#include <vector>
#include <math.h>
#include <algorithm>
using namespace std;
using std::vector;
class Solution {

    public: vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) 
    {
        int m=*max_element(candies.begin(),candies.end());
        vector <bool> result;
        for(int i=0;i<candies.size();i++)
        {
            if(candies[i]+extraCandies>=m)
            {
                result.push_back(true);
            }
            else
            {
                result.push_back(false);
            }
            
        }
        return result;
        
    }
    
};
int main()
{
    Solution s;
    int n,num;
    cout<<"enter no.";
    cin>>n;
    vector<int> candies;
    
    for(int i=0;i<n;i++)
    {
        cin>>num;
        candies.push_back(num);
    }
    int extraCandies;
    cin>>extraCandies;
    vector<bool> result=s.kidsWithCandies(candies, extraCandies);
    
    for (bool b : result) {
        cout << (b ? "true" : "false") << " ";
    }
    cout << endl;
    return 0;

}