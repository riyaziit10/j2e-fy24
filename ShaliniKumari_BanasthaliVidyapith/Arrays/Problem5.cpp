
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int search(vector<int>& nums, int target) {
    int s=0;
    int e=nums.size()-1;
    while(s<=e)
    {
        int mid=(s+e)>>1;
        if(nums[mid]==target)
            return mid;
        if(nums[s]<=nums[mid]){
            if(nums[s]<=target && nums[mid]>=target)
                e=mid-1;
            else
                s=mid+1;
        }else{
            if(nums[mid]<=target && target <= nums[e])
                s=mid+1;
            else
                e=mid-1;
        }
    }return -1;
}
int main() {
    vector<int>nums= {4,5,6,7,0,1,2};
    int target=0;
    int answer = search(nums,target);
    cout << answer << endl;
    return 0;
}