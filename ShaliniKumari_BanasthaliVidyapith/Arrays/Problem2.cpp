#include <iostream>
#include <vector>
using namespace std;

int maxArea(vector<int>& height) {
    int L = 0, R = height.size() - 1, water = 0;
    while (L < R) {
        int area;
        if (height[L] < height[R]) {
            area = height[L] * (R - L);
            L++;
        } else {
            area = height[R] * (R - L);
            R--;
        }
        if (area > water)
            water = area;
    }
    return water;
}

int main() {
    vector<int> height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int answer = maxArea(height);
    cout << answer << endl;
    return 0;
}