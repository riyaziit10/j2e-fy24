class Solution {
public:
    void sortColors(vector<int>& nums) 
    {
        int l,m,h;
        l=0;
        m=0;
        h=nums.size()-1;
        while(m<=h)
        {
            if(nums[m]==0)
            {
                swap(nums[l],nums[m]);
                l++;
                m++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else if(nums[m]==2)
            {
                swap(nums[h],nums[m]);
                h--;
            }
        }
        
    }
};
int main()
{
    Solution s;
    int n,num;
    cout<<"enter no.";
    cin>>n;
    vector<int> nums;
    
    for(int i=0;i<n;i++)
    {
        cin>>num;
        nums.push_back(num);
    }
    s.sortColors(nums);   
    for(int i=0;i<n;i++)
    {
        cout<<nums[i];
    }
   
    return 0;

}
