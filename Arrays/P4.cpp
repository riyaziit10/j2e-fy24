#include <bits/stdc++.h>
using namespace std;

void solution(vector<int>& arr)
{
	int n = arr.size(), i, j;

	for (i = n - 2; i >= 0; i--) {
		if (arr[i] < arr[i + 1]) {
			break;
		}
	}

	if (i < 0) {
		reverse(arr.begin(), arr.end());
	}


	else {
		for (j = n - 1; j > i; j--) {
			if (arr[j] > arr[i]) {
				break;
			}
		}

		
		swap(arr[i], arr[j]);

		
		reverse(arr.begin() + i + 1, arr.end());
	}
}

int main()
{

	int n;
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i < n; i++)
       cin>>arr[i];
    solution(arr);
    for(int i = 0; i < n; i++)
       cout<<arr[i];
}
