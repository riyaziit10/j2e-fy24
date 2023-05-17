#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end());
        if(intervals.size()==0){
            return ans;
        }
        vector <int> temp = intervals[0];
        for(int i=0;i<intervals.size();i++){
            if(intervals[i][0]<=temp[1]){
                temp[1]=max(temp[1],intervals[i][1]);
            }
            else{
                ans.push_back(temp);
                temp=intervals[i];
            }
        }
        ans.push_back(temp);
        return ans;
}

int main()
{
    int n;
    cin>>n;
    vector<vector<int>>intervals;
    vector<vector<int>>ans;
    for(int i = 0; i < n; i++)
    {
        vector<int>in(2);
        for(int j = 0; j < 2; j++)
           cin>>in[j];
        intervals.push_back(in);
    }

    ans = merge(intervals);
    for(int i = 0; i < ans.size(); i++)
    {
        for(int j = 0; j < 2; j++)
          cout<<ans[i][j]<<" ";
        cout<<endl;
    }
        
}