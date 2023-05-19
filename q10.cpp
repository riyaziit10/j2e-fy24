#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int maxProfit(vector<int>& prices) 
    {
        int maxp=0;
        for (int i=1;i<prices.size();i++)
        {
            if(prices[i]>prices[i-1])
            {
                int profit=prices[i]-prices[i-1];
                maxp+=profit;
            }
        }
        return maxp;
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
    int result=s.maxProfit(prices);
    cout<<result;
    return 0;

}
