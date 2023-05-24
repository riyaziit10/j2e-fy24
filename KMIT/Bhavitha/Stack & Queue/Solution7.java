/*
7. GIVEN AN ARRAY, FIND THE NEXT GREATER ELEMENT (NGE) FOR EVERY ELEMENT
IN THE ARRAY. THE NEXT GREATER ELEMENT FOR AN ELEMENT X IS THE FIRST
GREATER ELEMENT ON THE RIGHT SIDE OF X IN THE ARRAY. IF THERE IS NO
GREATER ELEMENT ON THE RIGHT SIDE, THEN THE OUTPUT FOR THAT ELEMENT
SHOULD BE -1.
*/
class Solution {
public int[] nextGreaterElements(int[] nums) {
Stack<Integer>st=new Stack<>();
int res[]=new int[nums.length];
for(int i=2*nums.length-1;i>=0;i--)
{
while(!st.empty() && nums[st.peek()]<=nums[i%nums.length])
{
st.pop();
}
res[i%nums.length]=st.empty()?-1:nums[st.peek()];
st.push(i%nums.length);
}
return res;
}
}