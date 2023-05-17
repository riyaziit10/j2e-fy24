/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
*/


#include<iostream>
using namespace std;

void candy(int arr[], int n, int max, int ext, bool ans[])
{

    /* if the no. of candies after adding the extracandy to each kid is equal to or greater than max then it will be true otherwise false for that kid.*/
    for(int i = 0; i < n; i++)
       ans[i] = (arr[i] + ext) >= max ? true : false;

}


int main()
{
    int n, extcandy;

    cout<<"Enter the number of kids: ";
    cin>>n;
    
    int arr[n];
    cout<<"Enter the number of extra candies: ";
    cin>>extcandy;
    cout<<"Enter the no of candies each kid has: \n";
    for(int i = 0; i < n; i++)
       cin>>arr[i];

    //Find the maximum of the elements

    int max = arr[0];
    for(int i = 1; i < n; i++)
       if(arr[i]>max)
        max = arr[i];

    bool ans[n];
    candy(arr,n,max,extcandy,ans);

    for(int i = 0; i < n; i++)
       cout << ans[i] << " ";
    
}


/*
Time Complexity : O(n) as n+n=2n which is equivalent to O(n)
Space Complexity : O(n) to store the answer 
*/