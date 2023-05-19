#include <bits/stdc++.h>  
using namespace std;  

int findKthLargest(vector<int>& nums, int k) {
        priority_queue<int, vector<int>, greater<int>> min_heap;
        for (int num : nums) {
            min_heap.push(num);
            if (min_heap.size() > k) {
                min_heap.pop();
            }
        }
        return min_heap.top();
}

int main() {
    int n, k;
    cin >> n;
    vector<int> arr(n);
    for(int i = 0; i < n; i++)
       cin>>arr[i];
    cin >> k;
	cout << findKthLargest(arr, k);
	return 0;
}