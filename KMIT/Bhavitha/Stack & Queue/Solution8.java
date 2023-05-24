
/*
 GIVEN A STRING S CONSISTING OF LOWERCASE LETTERS, REMOVE ADJACENT
DUPLICATES FROM S. THE FINAL OUTPUT SHOULD BE IN LEXICOGRAPHICALLY
SMALLEST ORDER.
*/
class Solution {
public String removeDuplicates(String s) {
Stack<Character>st=new Stack<>();
String str="";
for(int i=0;i<s.length();i++)
{
if(!st.empty() && s.charAt(i)==st.peek())
st.pop();
else
st.push(s.charAt(i));
}
for(Character e:st)
{
str=str+e;
}
return str;
}
}