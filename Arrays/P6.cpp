#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void permuteUnique(vector<int>& nums, vector<vector<int>>& output, vector<int> temp, vector<bool>& visited){
        if(temp.size() == nums.size()){
            output.push_back(temp);
            return;
        }
        for(int i=0; i<nums.size(); i++){
            if(visited[i] || i>0 && nums[i] == nums[i-1] && !visited[i-1]) continue;
            visited[i] = true;
            temp.push_back(nums[i]);
            permuteUnique(nums, output, temp, visited);
            temp.pop_back();
            visited[i] = false;
        }
    }

 vector<vector<int>> permuteUnique(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> output;
        vector<int> temp;
        vector<bool> visited(nums.size(), 0); 
        permuteUnique(nums, output, temp, visited);
        return output;
    }


int main()
{

    int n;
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i < n; i++)
       cin>>arr[i];
    vector<vector<int>>ans;
    ans = permuteUnique(arr);
    for(int i = 0; i < ans.size(); i++)
    {
        for(int j = 0; j < n; j++)
          cout<<ans[i][j]<<" ";
        cout<<endl;
    }
        

}