#include <iostream>
#include <vector>
using namespace std;
int maxSubArray(vector<int>& nums) {
    int max_=nums[0];
    int curr_=nums[0];
    for(int i=1;i<nums.size();i++){
        curr_=max(nums[i],curr_+nums[i]);
        max_=max(curr_,max_);
    }
    return max_;
}
int main() {
    vector<int> nums= {-2,1,-3,4,-1,2,1,-5,4};
    int answer = maxSubArray(nums);
    cout << answer << endl;
    return 0;
}