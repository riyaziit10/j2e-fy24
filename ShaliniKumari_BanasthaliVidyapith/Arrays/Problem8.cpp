#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
vector<vector<int>> merge(vector<vector<int>>& intervals) {
    sort(intervals.begin(),intervals.end());
    int n=intervals.size();
    vector<vector<int>>ans;
    for(int i=0;i<n;i++){
        if(ans.empty()){
            ans.push_back(intervals[i]);
        }else{
            vector<int>&a=ans.back();
            int y=a[1];
            if(intervals[i][0]<=y){
               a[1]=max(intervals[i][1],y);
            }else{
                ans.push_back(intervals[i]);
            }
        }
    }
    return ans;
}
int main() {
    vector<vector<int>> intervals= {{1,3},{2,6},{8,10},{15,18}};
    vector<vector<int>> answer = merge(intervals);
    for (const vector<int>& interval : answer) {
        cout << "[" << interval[0] << ", " << interval[1] << "] ";
    }
    cout << endl;
}