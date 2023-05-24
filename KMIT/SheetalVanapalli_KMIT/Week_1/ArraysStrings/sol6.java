import java.util.ArrayList;
import java.util.List;

public class sol6 {
    static List<List<Integer>> res = new ArrayList<List<Integer>>();
    static List<Integer> curr = new ArrayList<Integer>();
    static List<List<Integer>> getPermutations(int []nums){
        dfs(nums, new boolean[nums.length]);
        return res;
    }
    static void dfs(int[]nums, boolean[]v){
        if(curr.size()>=nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(v[i]==true || i>0 &&  nums[i]==nums[i-1] && v[i-1]==false) continue;
            v[i]=true;
            curr.add(nums[i]);
            dfs(nums,v);
            v[i]=false;
            curr.remove((Object)nums[i]);
        }
    }
    public static void main(String[] args) {
        int []nums={1,2,2};
        System.out.println(getPermutations(nums));
    }
}
