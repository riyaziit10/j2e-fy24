/*
Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
 
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:
Input: nums = [0]
Output: [[],[0]]
*/
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        Queue<List<Integer>> q=new  LinkedList<>();
       
        subset(nums,n,0,q,new ArrayList<>());
        List<List<Integer>> ans=new ArrayList<>();
        System.out.println(q);
        for(List<Integer> i:q)
        {
            if(!ans.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;

    }
    public void subset(int[] arr,int nd,int ind,Queue<List<Integer>> q,List<Integer> ds)
    {
        if(ind==arr.length)
        {
            q.add(new LinkedList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        subset(arr,nd,ind+1,q,ds);
        ds.remove(ds.size()-1);
        subset(arr,nd,ind+1,q,ds);

    }
}
