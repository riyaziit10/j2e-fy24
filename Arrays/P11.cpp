#include<iostream>
#include<vector>
using namespace std;

int index(vector<int> ele)
{
    int max = INT32_MIN,index;
    for(int i = 0; i < ele.size(); i++)
    {
        if(ele[i] > max)
        {
          max = ele[i];
          index = i;
        }

    }
    return index;
}

int main()
{
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i < n; i++)
       cin>>arr[i];
    cout << index(arr);

}