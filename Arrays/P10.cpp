#include<iostream>
#include<vector>
using namespace std;

int maxProfit(vector<int>& prices) {
        int profit=0;
        int minPrice=INT32_MAX;
        for(int i=0;i<prices.size();i++){
            minPrice = min(minPrice,prices[i]);
                if((prices[i]-minPrice)>0){
                    profit=profit+(prices[i]-minPrice);
                    minPrice=prices[i];
                }
        }
        return profit;
}

int main()
{
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i < n; i++)
       cin>>arr[i];
    cout << maxProfit(arr);

}