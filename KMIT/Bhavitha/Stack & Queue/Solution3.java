/*
3. GIVEN AN ARRAY ARR[] OF SIZE N AND AN INTEGER K. FIND THE MAXIMUM FOR
EACH AND EVERY CONTIGUOUS SUBARRAY OF SIZE K.
*/
class Solution {
public int[] maxSlidingWindow(int[] nums, int k) {
Stack<Integer> stack = new Stack<>();
int[] arr = new int[nums.length-k+1];
int p = 0;
for (int i = 0; i < nums.length; i++) {
while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
stack.pop();
}
stack.push(i);
if (i >= k-1) {
arr[p++] = nums[stack.firstElement()];
if (stack.firstElement() == i-k+1) {
stack.remove(0);
}
}
}
return arr;
}
}