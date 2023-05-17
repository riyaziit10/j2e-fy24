#include <iostream>
#include <vector>

using namespace std;

vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
    int n = candies.size();
    int maxCandies = 0;
    vector<bool> result(n);
    for (int i = 0; i < n; i++) {
        maxCandies = max(maxCandies, candies[i]);
    }

    for (int i = 0; i < n; i++) {
        if (candies[i] + extraCandies >= maxCandies) {
            result[i] = true;
        } else {
            result[i] = false;
        }
    }

    return result;
}

int main() {
    vector<int> candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;

    vector<bool> result = kidsWithCandies(candies, extraCandies);

    for (bool val : result) {
        cout << boolalpha << val << " ";
    }
    cout << endl;
    return 0;
}
