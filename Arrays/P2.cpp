#include<iostream>
using namespace std;


int solution(int arr[], int n)
{
    int i = 0, j = n-1;
    int max = 0;
    while(i < j)
    {
        if((min(arr[i],arr[j])*(j-i)) > max)
        {
           max = min(arr[i],arr[j])*(j-i);
           cout<<i<<" "<<j<<endl;
        }
        if(arr[i]<=arr[j])
           i++;
        else
           j--;
    }
    return max;
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0; i < n; i++)
       cin>>arr[i];
    
    cout << solution(arr,n);
    
}