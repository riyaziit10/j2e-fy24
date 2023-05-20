#include <iostream>
#include <vector>
using namespace std;
int findMaxConsecutiveOnes(vector<int>& nums) {
    int ans = 0, c = 0;
    for (int i = 0; i < nums.size(); i++) {
        if (nums[i]) {
            c++;
        } else {
            c = 0;
        }
        ans = max(ans, c);
    }
    return ans;
}
int main() {
    vector<int> nums = {1, 1, 0, 1, 1, 1};
    int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(nums);
    cout << "Max Consecutive Ones: " << maxConsecutiveOnes << endl;
    return 0;
}
