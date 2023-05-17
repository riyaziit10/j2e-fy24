#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<vector<int>> permuteUnique(vector<int>& nums) {
    sort(nums.begin(), nums.end());
    vector<vector<int>> ans;
    do {
        ans.push_back(nums);
    } while (next_permutation(nums.begin(), nums.end()));
    return ans;
}

int main() {
    vector<int> nums = {1, 1, 2};
    vector<vector<int>> answer = permuteUnique(nums);
    for (const vector<int>& permutation : answer) {
        for (int num : permutation) {
            cout << num << " ";
        }
        cout << endl;
    }

    return 0;
}
