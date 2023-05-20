
#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        int closestSum = nums[0] + nums[1] + nums[2];
        int diff = abs(closestSum - target);
        for (int i = 0; i < nums.size() - 2; i++) {
            int j = i + 1;
            int k = nums.size() - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (abs(sum - target) < diff) {
                    closestSum = sum;
                    diff = abs(sum - target);
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closestSum;
    }
int main() {
    vector<int>nums= {-1,2,1,-4};
    int target=1;
    int answer = threeSumClosest(nums,target);
    cout << answer << endl;
    return 0;
}