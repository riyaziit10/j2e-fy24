/*
6.GIVEN A STRING CONTAINING ONLY PARENTHESES, DETERMINE IF THE STRING IS
VALID. AN INPUT STRING IS VALID IF: ● ● Open brackets must be closed by the same type of
brackets. Open brackets must be closed in the correct order.
*/
class Solution {
public boolean isValid(String s) {
Stack<Character> st = new Stack<>();
for (int i = 0; i < s.length(); i++) {
if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
{
st.push(s.charAt(i));
} else if (s.charAt(i) == ')') {
if (st.isEmpty() || st.peek() != '(') {
return false;
}
st.pop();
} else if (s.charAt(i) == ']') {
if (st.isEmpty() || st.peek() != '[') {
return false;
}
st.pop();
} else if (s.charAt(i) == '}') {
if (st.isEmpty() || st.peek() != '{') {
return false;
}
st.pop();
}
}
return st.isEmpty();
}
}