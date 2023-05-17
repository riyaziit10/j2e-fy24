#include <iostream>
#include <vector>

using namespace std;

int maxConsecutiveOnes(vector<int>& nums) {
	int max_count = 0, current_count = 0, mask = 0;
	for (int i = 0; i < nums.size(); i++) {
		if (nums[i] == 1) {
			mask = (mask << 1) | 1;
		} else {
			mask = mask << 1;
		}
		if ((nums[i] & mask) != 0) {
			current_count++;
		} else {
			max_count = max(max_count, current_count);
			current_count = 0;
			mask = 0;
		}
	}
	max_count = max(max_count, current_count);
	return max_count;
}

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i = 0; i < n; i++)
       cin>>arr[i];
	cout << maxConsecutiveOnes(arr);
	return 0;
}
