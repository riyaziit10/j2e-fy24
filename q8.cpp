class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) 
    {
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end());
        int n=intervals.size();
        if(n==1)
        {
            return intervals;
        }
        
        for(int i=0;i<n-1;i++)
        {
            if(intervals[i][1]>=intervals[i+1][0])
            {
                int n1=min(intervals[i][0],intervals[i+1][0]);
                int n2=max(intervals[i][1],intervals[i+1][1]); 
                vector<int>a={n1,n2};
                auto it=intervals.begin()+i;
                intervals.erase(it);
                intervals[i]=a;
                n--;
                i--;
            }

        }
       return intervals; 
    }
};
int main()
{
    Solution s;
    int n,num1,num2;
    cout<<"enter no.";
    cin>>n;
    vector<vector<int>> intervals;
    
    for(int i=0;i<n;i++)
    {
        cin>>num1>>num2;
        
        intervals.push_back({num1,num2});
    }
    s.merge(intervals);
    
    for(int i=0;i<n;i++)
    {
        cout<<intervals[i];
    }
   
    return 0;

}

