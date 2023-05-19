#include<iostream>
#include<vector>
using namespace std;


void sortColors(vector<int>& nums) {
        for(int i=nums.size()-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
}

int main()
{
    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i < n; i++)
       cin>>arr[i];
    sortColors(arr);
    for(int i = 0; i < n; i++)
       cout<<arr[i]<<" ";

}