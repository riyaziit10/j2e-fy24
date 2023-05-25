import java.util.*;
public class A6 {
    
        public void permute(HashMap<Integer,Integer>hm,List<List<Integer>>ls,List<Integer>ans,int n){
          if(ans.size()==n){
              ls.add(new ArrayList<>(ans));
              return;
          }
            for(Integer i:hm.keySet()){
                if(hm.get(i)>0){
                    hm.put(i,hm.get(i)-1);
                    ans.add(i);
                    permute(hm,ls,ans,n);
                    ans.remove(ans.size()-1);
                    hm.put(i,hm.get(i)+1);
                }
            }
      }
      
      public List<List<Integer>> permuteUnique(int[] nums) {
      
       
          HashMap<Integer,Integer>hm=new HashMap<>();
          for(int i=0;i<nums.length;i++){
              if(hm.containsKey(nums[i])){
                  hm.put(nums[i],hm.get(nums[i])+1);
              }
              else{
                  hm.put(nums[i],1);
              }
          }
          List<List<Integer>>ls=new ArrayList<>();
          permute(hm,ls,new ArrayList<Integer>(),nums.length);
          return ls;
          
      
  }
      
    
    
  
   
}
