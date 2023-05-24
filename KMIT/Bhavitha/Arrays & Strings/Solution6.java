/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> s=new HashSet<>();
        boolean[] vis=new boolean[nums.length];
        perum(nums,s,new ArrayList<>(),vis) ;
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> i:s) ans.add(i);
        return ans;
    }
    public void perum(int[] arr, Set<List<Integer>> s,List<Integer> ds, boolean[] vis)
    {
        if(ds.size()==arr.length)
        {
            s.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(vis[i]!=true)
            {
                ds.add(arr[i]);
                vis[i]=true;
                perum(arr,s,ds,vis);
                ds.remove(ds.size()-1);
                vis[i]=false;
                
            }
        }
    }
}

