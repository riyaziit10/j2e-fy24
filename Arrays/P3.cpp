#include<iostream>
#include<algorithm>
using namespace std;


int solution(int arr[], int n, int target)
{
    sort(arr,arr+n);
    int l,h,ans,sum;
    int c = arr[0] + arr[1] +arr[2];
    for(int i = 0; i < n-2; i++)
    {
        int l = i+1, h = n-1, total;
        int sum = target - arr[i];
        while(l < h)
        {
            total = arr[i] + arr[l] + arr[h];
            if(abs(total - target) < abs(target - c))
            {
                c = total;
            }
            if(total > target)
               h = h-1;
            else if(total < target)
                l = l+1;
            else
                return c;

        }
    }

    return c;

}

int main()
{
    int n, target;
    cin>>n;
    int arr[n];
    for(int i = 0; i < n; i++)
       cin>>arr[i];
    cin>>target;

    cout<<solution(arr,n,target);
}